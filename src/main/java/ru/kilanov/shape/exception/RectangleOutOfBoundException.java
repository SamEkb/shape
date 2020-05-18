package ru.kilanov.shape.exception;

/**
 * Ошибка выхода за пределы полей.
 */
public class RectangleOutOfBoundException extends RuntimeException {
    public RectangleOutOfBoundException(String message) {
        super(message);
    }
}
