package ru.kilanov.shape.exception;

/**
 * Ошибка формата прямоугольника.
 */
public class IllegalFormatException extends RuntimeException {

    private static final long serialVersionUID = -9047323923399859721L;

    public IllegalFormatException(String message) {
        super(message);
    }
}
