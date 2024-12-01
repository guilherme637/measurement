package com.example.measurement.domain.service.weight;

import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;

public interface WeightServiceInterface {
    MeasurementResponseDto calculate(MeasurementRequestDto dto);
}
