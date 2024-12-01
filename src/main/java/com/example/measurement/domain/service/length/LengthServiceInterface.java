package com.example.measurement.domain.service.length;

import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;

public interface LengthServiceInterface {
    MeasurementResponseDto calculate(MeasurementRequestDto dto);
}
