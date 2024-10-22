package com.WeatherMonitoringApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.WeatherMonitoringApplication.Entity.WeatherData;
import com.WeatherMonitoringApplication.Service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String showWeatherForm() {
        return "weather";  // Highlight: Make sure this matches the actual name of the template
    }

    @PostMapping("/weather")
    public String getWeather(@RequestParam("city") String cityName, Model model) {
        WeatherData weather = weatherService.getWeather(cityName);
        model.addAttribute("weather", weather);
        return "weather";  // Highlight: Return the correct template name to display weather data
    }

	
}
