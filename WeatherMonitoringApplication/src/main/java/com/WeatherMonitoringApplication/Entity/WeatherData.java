package com.WeatherMonitoringApplication.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WeatherData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private String description;
    private double temperature;
    private double feelsLike; // Highlight: Added feels_like field
    private LocalDateTime timestamp;
	public WeatherData() {
		
		// TODO Auto-generated constructor stub
	}
	public WeatherData(Long id, String cityName, String description, double temperature, double feelsLike,
			LocalDateTime timestamp) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.description = description;
		this.temperature = temperature;
		this.feelsLike = feelsLike;
		this.timestamp = timestamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(double feelsLike) {
		this.feelsLike = feelsLike;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

   
    
    
   
}
