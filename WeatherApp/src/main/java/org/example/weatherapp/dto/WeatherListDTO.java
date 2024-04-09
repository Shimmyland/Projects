package org.example.weatherapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.weatherapp.entity.Weather;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class WeatherListDTO {

    private List<WeatherDTO> result = new ArrayList<>();

    public void add(Weather weather) {
        WeatherDTO weatherDTO = new WeatherDTO(
                weather.getCreateAt(),
                weather.getCity(),
                weather.getCountry(),
                weather.getTemperature(),
                weather.getWeather()
        );
        this.result.add(weatherDTO);
    }

    @Data
    @AllArgsConstructor
    public static class WeatherDTO {
        private LocalDateTime createAt;
        private String city;
        private String country;
        private double temperature;
        private String weather;
    }
}


