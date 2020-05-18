package ru.kilanov.shape.model.request;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Запрос на создание фигуры.
 */
@Valid
public class ShapeCreateRequest implements Serializable {
    @NotNull
    @Max(1000)
    private Integer coordinateX;
    @NotNull
    @Max(1000)
    private Integer coordinateY;
    @NotNull
    @Max(1000)
    private Integer coordinateW;
    @NotNull
    @Max(1000)
    private Integer coordinateH;
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

    public Integer getCoordinateW() {
        return coordinateW;
    }

    public void setCoordinateW(Integer coordinateW) {
        this.coordinateW = coordinateW;
    }

    public Integer getCoordinateH() {
        return coordinateH;
    }

    public void setCoordinateH(Integer coordinateH) {
        this.coordinateH = coordinateH;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
