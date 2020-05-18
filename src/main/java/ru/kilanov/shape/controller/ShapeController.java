package ru.kilanov.shape.controller;

import org.springframework.web.bind.annotation.*;
import ru.kilanov.shape.model.request.ShapeCreateRequest;
import ru.kilanov.shape.service.ShapeService;

import javax.validation.Valid;

/**
 * Рест сервис работы с прямоугольниками.
 */
@RestController
@RequestMapping("rectangle")
public class ShapeController {

    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping
    @RequestMapping(value = "/get", produces = "application/json")
    public int get(@RequestParam int coordinateX, @RequestParam int coordinateY) {
        return shapeService.get(coordinateX, coordinateY);
    }

    @PostMapping
    @RequestMapping(value = "/create", produces = "image/jpg")
    public @ResponseBody
    byte[] create(@Valid @RequestBody ShapeCreateRequest rectangleCreateRequest) {
        return shapeService.create(rectangleCreateRequest);
    }
}
