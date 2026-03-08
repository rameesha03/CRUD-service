package com.flood.sensor_service.repository;

import com.flood.sensor_service.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site, Integer> {
}