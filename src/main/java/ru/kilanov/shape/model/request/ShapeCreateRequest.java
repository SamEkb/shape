package ru.kilanov.shape.model.request;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Запрос на создание фигуры.
 */
@Valid
public class ShapeCreateRequest implements Serializable {

    /**
     * Координаты оси Х
     */
    @NotNull
    @Max(1000)
    private Integer coordinateX;

    /**
     * Координаты оси Y
     */
    @NotNull
    @Max(1000)
    private Integer coordinateY;

    /**
     * Ширина
     */
    @NotNull
    private Integer width;

    /**
     * Высота
     */
    @NotNull
    private Integer height;

    /**
     * Цвет
     */
    @NotBlank
    private String color;

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCreateRequest that = (ShapeCreateRequest) o;
        return Objects.equals(coordinateX, that.coordinateX) &&
                Objects.equals(coordinateY, that.coordinateY) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY, width, height, color);
    }
}
