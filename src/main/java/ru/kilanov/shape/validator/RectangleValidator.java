package ru.kilanov.shape.validator;

import org.springframework.stereotype.Component;
import ru.kilanov.shape.exception.IllegalFormatException;
import ru.kilanov.shape.model.request.ShapeCreateRequest;

/**
 * Валидация прямоугольника.
 */
@Component
public class RectangleValidator {

    public void validateRequest(ShapeCreateRequest request) {
        if (request.getCoordinateH() == request.getCoordinateW()) {
            throw new IllegalFormatException("Не верный формат прямоугольника");
        }
    }
}
