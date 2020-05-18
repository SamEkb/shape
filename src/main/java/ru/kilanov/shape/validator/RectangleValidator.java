package ru.kilanov.shape.validator;

import org.springframework.stereotype.Component;
import ru.kilanov.shape.exception.IllegalFormatException;
import ru.kilanov.shape.exception.RectangleOutOfBoundException;
import ru.kilanov.shape.model.request.ShapeCreateRequest;

/**
 * Валидация запроса на создание прямоугольника.
 */
@Component
public class RectangleValidator {

    private static final String ILLEGAL_FORMAT = "Не верный формат прямоугольника";
    private static final String OUT_OF_BOUND = "Выход за границы площади размещения прямоугольника";
    private static final int SIZE = 1000;

    public void validateRequest(ShapeCreateRequest request) {
        if (request.getHeight().equals(request.getWidth())) {
            throw new IllegalFormatException(ILLEGAL_FORMAT);
        }

        if (request.getHeight() + request.getCoordinateY() > SIZE
                || request.getWidth() + request.getCoordinateX() > SIZE) {
            throw new RectangleOutOfBoundException(OUT_OF_BOUND);
        }
    }
}
