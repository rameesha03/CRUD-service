package com.flood.sensor_service.repository;

import com.flood.sensor_service.entity.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorTypeRepository extends JpaRepository<SensorType, Integer> {
}