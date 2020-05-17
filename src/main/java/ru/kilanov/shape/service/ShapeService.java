package ru.kilanov.shape.service;

import ru.kilanov.shape.model.request.ShapeCreateRequest;

/**
 * Сервис для работы с фигурами.
 */
public interface ShapeService {

    /**
     * Создание фигуры
     *
     * @param request запрос на создание
     * @return созданная фигура
     */
    byte[] create(ShapeCreateRequest request);

    /**
     * Получение идентефикатора фигуры по заданным координатам
     *
     * @param coordinateX координаты оси Х
     * @param coordinateY координаты оси Y
     * @return идентефикатор
     */
    int get(int coordinateX, int coordinateY);

}
