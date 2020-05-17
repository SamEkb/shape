package ru.kilanov.shape.exception;

/**
 * Ошибка выбора цвета.
 */
public class ColorNotFoundException extends RuntimeException {
    public ColorNotFoundException(String message) {
        super(message);
    }
}
