package com.example.Weather_data_API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // ignore Unused Fields
public class WeatherResponseDTO {

    @JsonProperty("temperature")
    private String temperature;
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }


    @JsonProperty("windspeed")
    private double windSpeed;
    public double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("weathercode")
    private int weatherCode;
    public int getWeatherCode() {
        return weatherCode;
    }
    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    @JsonProperty("time")
    private String time;
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    private String weatherDescription;
    public String getWeatherDescription() {
        return weatherDescription;
    }
    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    private String weatherIcon;
    public String getWeatherIcon() {
        return weatherIcon;
    }
    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

}
