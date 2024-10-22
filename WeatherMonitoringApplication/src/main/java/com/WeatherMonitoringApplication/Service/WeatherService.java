package com.WeatherMonitoringApplication.Service;

import com.WeatherMonitoringApplication.Entity.WeatherData;

public interface WeatherService {

	 

	WeatherData getWeather(String cityName);

}
