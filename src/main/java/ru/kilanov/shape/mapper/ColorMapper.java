package ru.kilanov.shape.mapper;

import org.springframework.stereotype.Component;
import ru.kilanov.shape.exception.ColorNotFoundException;

import java.awt.*;

/**
 * Маппер цвета фигуры.
 */
@Component
public class ColorMapper {

    private static final String COLOR_NOT_FOUND = "Цвет не найден";

    public Color mapColor(String color) {
        Color result;
        switch (color.toLowerCase()) {
            case "black":
                result = Color.BLACK;
                break;
            case "red":
                result = Color.RED;
                break;
            case "blue":
                result = Color.BLUE;
                break;
            case "yellow":
                result = Color.YELLOW;
                break;
            case "white":
                result = Color.WHITE;
                break;
            case "green":
                result = Color.GREEN;
                break;
            case "gray":
                result = Color.GRAY;
                break;
            case "darkGray":
                result = Color.DARK_GRAY;
                break;
            case "LIGHT_GRAY":
                result = Color.LIGHT_GRAY;
                break;
            case "pink":
                result = Color.PINK;
                break;
            case "orange":
                result = Color.ORANGE;
                break;
            default:
                throw new ColorNotFoundException(COLOR_NOT_FOUND);
        }
        return result;
    }
}
