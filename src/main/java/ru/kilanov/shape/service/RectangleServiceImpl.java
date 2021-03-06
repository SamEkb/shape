package ru.kilanov.shape.service;

import org.springframework.stereotype.Service;
import ru.kilanov.shape.mapper.ColorMapper;
import ru.kilanov.shape.model.Rectangle;
import ru.kilanov.shape.model.request.ShapeCreateRequest;
import ru.kilanov.shape.validator.RectangleValidator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class RectangleServiceImpl implements ShapeService {

    private static final int SIZE = 1000;
    private static final String JPG = "jpg";
    private static final int NULL = 0;

    private List<Rectangle> rectangles = new ArrayList<>();
    private int index = 1;

    private final RectangleValidator validator;
    private final ColorMapper mapper;

    public RectangleServiceImpl(RectangleValidator validator, ColorMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    @Override
    public byte[] create(ShapeCreateRequest rectangleCreateRequest) {
        validator.validateRequest(rectangleCreateRequest);
        try {
            BufferedImage img = createImage(rectangleCreateRequest);

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            ImageIO.write(img, JPG, byteArrayOutputStream);

            byte[] result = byteArrayOutputStream.toByteArray();

            save(result, rectangleCreateRequest);

            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int get(int coordinateX, int coordinateY) {
        return rectangles.stream()
                .filter(s ->
                        s.getCoordinateY() <= coordinateY
                                && s.getCoordinateX() <= coordinateX
                                && s.getCoordinateY() + s.getCoordinateH() >= coordinateY
                                && s.getCoordinateX() + s.getCoordinateW() >= coordinateX
                )
                .map(Rectangle::getId)
                .reduce((first, second) -> second)
                .orElse(NULL);
    }

    private BufferedImage createImage(ShapeCreateRequest request) {
        BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        g2d.setBackground(Color.WHITE);
        g2d.clearRect(NULL, NULL, SIZE, SIZE);

        g2d.setColor(mapper.mapColor(request.getColor()));
        g2d.fill(new Rectangle2D.Float(request.getCoordinateX(), request.getCoordinateY(), request.getWidth(),
                request.getHeight()));

        g2d.dispose();

        return image;
    }

    private void save(byte[] result, ShapeCreateRequest request) {
        Rectangle rectangle = new Rectangle();
        rectangle.setId(index);
        rectangle.setColor(request.getColor());
        rectangle.setCoordinateX(request.getCoordinateX());
        rectangle.setCoordinateY(request.getCoordinateY());
        rectangle.setCoordinateH(request.getHeight());
        rectangle.setCoordinateW(request.getWidth());
        rectangle.setCreateDate(OffsetDateTime.now());
        rectangle.setResult(result);

        rectangles.add(rectangle);
        index++;
    }
}
