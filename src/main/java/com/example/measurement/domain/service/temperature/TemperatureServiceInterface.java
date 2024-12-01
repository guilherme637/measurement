package com.example.measurement.domain.service.temperature;

import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;

public interface TemperatureServiceInterface {
    MeasurementResponseDto calculate(MeasurementRequestDto dto);
}
