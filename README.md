# 🌦️ Weather Monitoring Application

A modern and visually appealing **Weather Monitoring Web Application** that provides real-time weather updates for any city. Built using **Spring Boot**, **Thymeleaf**, and **OpenWeatherMap API**, with a stunning front-end design featuring animated clouds, raindrops, lightning, stars, and a dynamic weather scene.

---

## 🚀 Features

- **Real-time Weather Data**: Fetches live weather information such as temperature, description, and feels-like conditions.
- **Animated Weather Scene**:
  - Moving clouds with emojis (rainy, sunny, night, etc.).
  - Dynamic sun, moon, and mist effects.
  - Lightning animations for storm conditions.
  - Stars and galaxy-inspired background elements.
- **Search Functionality**: Users can search weather information by entering the city name.
- **Responsive Design**: Works seamlessly on desktop and mobile devices.
- **Error Handling**: Displays user-friendly error messages for invalid city names.
- **Weather Card**: Attractive glassmorphism weather card for displaying results.

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, Spring MVC
- **Frontend**: Thymeleaf, HTML5, CSS3, JavaScript (for animations)
- **API**: OpenWeatherMap API
- **Build Tool**: Maven
- **Database**: Not required (API-based application)

---

## 📂 Project Structure

weather-monitoring/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/weather/
│ │ │ ├── controller/WeatherController.java
│ │ │ ├── service/WeatherService.java
│ │ │ ├── service/impl/WeatherServiceImpl.java
│ │ │ ├── model/Weather.java
│ │ │ └── WeatherMonitoringApplication.java
│ │ └── resources/
│ │ ├── templates/
│ │ │ ├── index.html
│ │ │ └── result.html
│ │ └── application.properties
│ └── test/...
│
├── pom.xml
└── README.md

🌐 API Endpoint
POST /weather – Fetches weather details for a given city.

🎨 Screenshots (UI Highlights)
Welcome Page: Animated clouds, sun, moon, stars, and a "Go to Weather Monitoring" button.

Weather Results: A card showing:

Weather description

Temperature and feels-like temperature

City name and current time.


📌 Future Enhancements
Add 7-day forecast support.

Support geolocation-based weather updates.

Add dark/light mode toggle.

Integrate with Google Maps for location display.
