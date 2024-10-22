package com.WeatherMonitoringApplication.Service;

import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.WeatherMonitoringApplication.Entity.WeatherData;
import com.WeatherMonitoringApplication.Reposoteries.WeatherDataRepository;

@Service
public class WeatherServiceImpl implements WeatherService{

	

    @Autowired
    private WeatherDataRepository weatherDataRepository;

    private final String API_KEY = "60996a025801e447ccfe3bf7e02d87b1";  
    private final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q={cityName}&appid=" + API_KEY;

    public WeatherData getWeather(String cityName) {
        RestTemplate restTemplate = new RestTemplate();
        String weatherResponse = restTemplate.getForObject(API_URL, String.class, cityName);

        JSONObject jsonObject = new JSONObject(weatherResponse);
        String description = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description");
        double temperature = jsonObject.getJSONObject("main").getDouble("temp") - 273.15;  // Kelvin to Celsius
        double feelsLike = jsonObject.getJSONObject("main").getDouble("feels_like") - 273.15; // Highlight: Added feels_like

        WeatherData weatherData = new WeatherData();
        weatherData.setCityName(cityName);
        weatherData.setDescription(description);
        weatherData.setTemperature(temperature);
        weatherData.setFeelsLike(feelsLike);  
        weatherData.setTimestamp(LocalDateTime.now());

        weatherDataRepository.save(weatherData);
        return weatherData;
    }


}
