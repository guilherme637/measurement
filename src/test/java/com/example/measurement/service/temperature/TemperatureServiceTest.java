package com.example.measurement.service.temperature;


import com.example.measurement.domain.service.temperature.TemperatureService;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import com.example.measurement.service.AbstractServiceTest;
import com.example.measurement.service.temperature.provider.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureServiceTest extends AbstractServiceTest {

    protected MeasurementResponseDto buildResponse(String from, String to, Double number) {
        return new TemperatureService().calculate(this.buildRequestDto(from, to, number));
    }

    @ParameterizedTest
    @ArgumentsSource(CelsiusProvider.class)
    public void calculateCelsiusTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(FahrenheitProvider.class)
    public void calculateFahrenheitTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }
}
