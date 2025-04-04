package com.example.Weather_data_API;

import lombok.Data;

import java.util.List;

@Data
public class GeoCodingResponseDTO {

    private List<Location> results;

    public List<Location> getResults(){
        return results;
    }

    @Data
    public static class Location{
        private double latitude;
        private double longitude;

        public double getLatitude(){
            return latitude;
        }

        public double getLongitude(){
            return longitude;
        }
    }
}
