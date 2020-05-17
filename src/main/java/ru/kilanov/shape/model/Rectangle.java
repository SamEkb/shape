package ru.kilanov.shape.model;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;

/**
 * Сущность прямоугольник.
 */
public class Rectangle {
    private int id;
    private int coordinateX;
    private int coordinateY;
    private int coordinateW;
    private int coordinateH;
    private String color;
    private OffsetDateTime createDate;
    byte[] result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return id == rectangle.id &&
                coordinateX == rectangle.coordinateX &&
                coordinateY == rectangle.coordinateY &&
                coordinateW == rectangle.coordinateW &&
                coordinateH == rectangle.coordinateH &&
                Objects.equals(color, rectangle.color) &&
                Objects.equals(createDate, rectangle.createDate) &&
                Arrays.equals(result, rectangle.result);
    }

    @Override
    public int hashCode() {
        int result1 = Objects.hash(id, coordinateX, coordinateY, coordinateW, coordinateH, color, createDate);
        result1 = 31 * result1 + Arrays.hashCode(result);
        return result1;
    }
}
