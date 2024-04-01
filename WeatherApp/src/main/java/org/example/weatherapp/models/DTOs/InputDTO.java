package org.example.weatherapp.models.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputDTO {

    // used for weather API as an input

    private UUID id;
    private String city;
}
