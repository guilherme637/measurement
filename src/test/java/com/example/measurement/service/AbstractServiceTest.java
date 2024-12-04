package com.example.measurement.service;

import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;

public abstract class AbstractServiceTest {
    final protected MeasurementRequestDto buildRequestDto(String from, String to, Double number) {
        MeasurementRequestDto measurementRequestDto = new MeasurementRequestDto();
        measurementRequestDto.setNumber(number);
        measurementRequestDto.setUnitFrom(from);
        measurementRequestDto.setUnitTo(to);

        return measurementRequestDto;
    }

    protected abstract MeasurementResponseDto buildResponse(String from, String to, Double number);
}