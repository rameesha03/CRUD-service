package com.flood.sensor_service.controller;

import com.flood.sensor_service.entity.SensorType;
import com.flood.sensor_service.service.SensorTypeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensorTypes")
public class SensorTypeController {

    private final SensorTypeService service;

    public SensorTypeController(SensorTypeService service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public SensorType updateSensorType(@PathVariable int id, @RequestBody SensorType typeDetails) {
        return service.updateSensorType(id, typeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorType(@PathVariable int id) {
        service.deleteSensorType(id);
    }
}