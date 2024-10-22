package com.WeatherMonitoringApplication.Reposoteries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WeatherMonitoringApplication.Entity.WeatherData;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long>{

}
