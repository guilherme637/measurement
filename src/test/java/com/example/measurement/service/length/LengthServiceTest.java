package com.example.measurement.service.length;

import com.example.measurement.domain.service.length.LegthService;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import com.example.measurement.service.length.provider.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthServiceTest {

    private MeasurementResponseDto buildResponse(String from, String to, Double number) {
        MeasurementRequestDto measurementRequestDto = new MeasurementRequestDto();
        measurementRequestDto.setNumber(number);
        measurementRequestDto.setUnitFrom(from);
        measurementRequestDto.setUnitTo(to);

        return new LegthService().calculate(measurementRequestDto);
    }

    @ParameterizedTest
    @ArgumentsSource(MillimeterProvider.class)
    public void calculateMillimeterTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(CentimeterProvider.class)
    public void calculateCentimeterTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(MeterProvider.class)
    public void calculateMeterTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(KilometerProvider.class)
    public void calculateKilometerTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(InchProvider.class)
    public void calculateInchTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(FootProvider.class)
    public void calculateFootTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(MileProvider.class)
    public void calculateMileTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }
}
