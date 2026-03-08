package com.flood.sensor_service.service;

import com.flood.sensor_service.entity.SensorType;
import com.flood.sensor_service.repository.SensorTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class SensorTypeService {

    private final SensorTypeRepository repository;

    public SensorTypeService(SensorTypeRepository repository) {
        this.repository = repository;
    }

    public SensorType updateSensorType(int id, SensorType typeDetails) {

        SensorType type = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("SensorType not found with id " + id));

        type.setType(typeDetails.getType());

        return repository.save(type);
    }

    public void deleteSensorType(int id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("SensorType not found with id " + id);
        }

        repository.deleteById(id);
    }
}