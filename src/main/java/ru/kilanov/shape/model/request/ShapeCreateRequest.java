package ru.kilanov.shape.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Запрос на создание фигуры.
 */
public class ShapeCreateRequest implements Serializable {
    @Size(max = 1000)
    private int coordinateX;
    @Size(max = 1000)
    private int coordinateY;
    @Size(max = 1000)
    private int coordinateW;
    @Size(max = 1000)
    private int coordinateH;
    @NotNull
    private String color;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getCoordinateW() {
        return coordinateW;
    }

    public void setCoordinateW(int coordinateW) {
        this.coordinateW = coordinateW;
    }

    public int getCoordinateH() {
        return coordinateH;
    }

    public void setCoordinateH(int coordinateH) {
        this.coordinateH = coordinateH;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
