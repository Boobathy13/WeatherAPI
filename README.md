# 🌦️ Weather Data API

## 📌 Overview  
Weather Data API is a Spring Boot-based application that fetches real-time weather data using the Open-Meteo API. It takes a location as input, retrieves its coordinates, and then fetches the weather details, including temperature, wind speed, and weather conditions.

## ✨ Features  
- ✅ Get latitude & longitude for a location using **Geocoding API**  
- ✅ Fetch **real-time weather** data based on location  
- ✅ Returns **temperature, wind speed, weather code, and time**  
- ✅ **Spring Boot WebClient** for API calls  
- ✅ RESTful API returning **JSON responses**  

## 🛠 Tech Stack  
- **Java 21** – Latest Java version  
- **Spring Boot** – Backend framework  
- **Spring WebClient** – For external API requests  
- **MongoDB** *(Optional: If persistence is needed)*  
- **Maven** – Dependency management  
- **Open-Meteo API** – Provides weather data  

---

## 🔧 Prerequisites  
Before running the project, ensure the following:  
- **Java 21** is installed  
- **Maven** is installed  
- **Spring Boot** is set up in your IDE  

---

## 🛀 Installation  

### 1️⃣ Clone the Repository  
```sh
git clone https://github.com/your-username/WeatherDataAPI.git
cd WeatherDataAPI
```

### 2️⃣ Build and Run the Application  
```sh
mvn clean install
mvn spring-boot:run
```

### 3️⃣ Test the API  
After starting the application, you can test the API by making a **GET request**:  

#### Example: Fetch weather for "Coimbatore"  
```sh
GET http://localhost:8080/weather?location=Coimbatore
```

#### Example JSON Response:  
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

## 💁 Project Structure  

```
WeatherDataAPI/
│
├── src/
│   ├── main/java/com/example/Weather_data_API/
│   │   ├── controller/
│   │   │   ├── WeatherController.java   # API Endpoints
│   │   ├── service/
│   │   │   ├── WeatherService.java      # Business logic
│   │   ├── dto/
│   │   │   ├── GeoCodingResponseDTO.java   # Geocoding response
│   │   │   ├── WeatherAPIResponseDTO.java  # API weather response
│   │   │   ├── WeatherResponseDTO.java     # Final response DTO
│   │   ├── config/
│   │   │   ├── WebClientConfig.java     # Configures WebClient
│   │   ├── WeatherDataApiApplication.java  # Main Spring Boot app
│
├── .gitignore    # Ignore unnecessary files
├── pom.xml       # Maven dependencies
├── README.md     # Project documentation
```

---

## 🚀 Future Enhancements  
- 🔹 Multi-day Forecast: Extend API to fetch hourly/daily weather  
- 🔹 Caching: Use Redis to store results and reduce API calls  
- 🔹 Database Integration: Store past weather searches in MongoDB  
- 🔹 Frontend UI: Create a simple web interface for weather lookup  

---

## 📝 License  
This project is open-source and available under the **MIT License**.

---

### 💡 Need Help?  
Feel free to open an issue on GitHub! 🚀

