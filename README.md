# 🌦️ WeatherWise - Real-time Weather Dashboard

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-green)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

---

## 📌 Overview

**WeatherWise** is a real-time weather dashboard built with **Spring Boot** that fetches and displays live weather data using the **Open-Meteo API**.
It takes a location name as input, fetches its coordinates using the **Geocoding API**, and then retrieves real-time weather details like temperature, wind speed, and weather conditions.

---

## ✨ Features

* ✅ Get latitude & longitude for any location using **Geocoding API**
* ✅ Fetch **real-time weather** data based on coordinates
* ✅ Returns **temperature, wind speed, weather code, and time**
* ✅ Uses **Spring Boot WebClient** for non-blocking API calls
* ✅ RESTful API returning clean **JSON responses**

---

## 🧰 Tech Stack

* **Java 21** – Latest Java version
* **Spring Boot** – Backend framework
* **Spring WebClient** – API communication
* **MongoDB** *(Optional: for persistence)*
* **Maven** – Project build & dependency management
* **Open-Meteo API** – Free weather data provider

---

## 🔧 Prerequisites

Ensure you have the following installed:

* ✅ Java 21
* ✅ Maven
* ✅ Spring Boot enabled IDE (e.g., IntelliJ, Eclipse, VS Code)

---

## 🛠️ Installation

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/WeatherDataAPI.git
cd WeatherDataAPI
```

### 2️⃣ Build and Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🌐 API Usage

Once the app is running, make a `GET` request to the following endpoint:

🔗 [http://localhost:8080/weather?location=Coimbatore](http://localhost:8080/weather?location=Coimbatore)

### 📦 Example JSON Response:

```json
{
    "weatherDescription": "Thunderstorm",
    "weatherIcon": "🌩️",
    "temperature": "25.1",
    "windspeed": 1.8,
    "weathercode": 95,
    "time": "2025-04-04T16:30"
}
```

---

## 🧭 Project Structure

```
WeatherDataAPI/
│
├── src/
│   └── main/java/com/example/Weather_data_API/
│       ├── controller/
│       │   └── WeatherController.java        # Handles HTTP requests
│       ├── service/
│       │   └── WeatherService.java           # Core logic & API calls
│       ├── dto/
│       │   ├── GeoCodingResponseDTO.java     # Geocoding API response
│       │   ├── WeatherAPIResponseDTO.java    # Raw weather API response
│       │   └── WeatherResponseDTO.java       # Final JSON response DTO
│       ├── config/
│       │   └── WebClientConfig.java          # WebClient setup
│       └── WeatherDataApiApplication.java    # Main class
│
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🚀 Future Enhancements

* 🔄 **Multi-day Forecast:** Add hourly & weekly forecast support
* 🚀 **Caching:** Integrate Redis to minimize API hits
* 💾 **Database Integration:** Store search history using MongoDB
* 🌐 **Frontend UI:** Add React or Angular-based interface

---

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Boobathy R** 
📧 [Mail ID](mailto:hungrylearner2002@gmail.com)
---
