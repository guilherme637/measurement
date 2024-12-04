package com.example.measurement.service.weight;


import com.example.measurement.domain.service.weight.WeightService;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import com.example.measurement.service.AbstractServiceTest;
import com.example.measurement.service.weight.provider.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeightServiceTest extends AbstractServiceTest {

    @Override
    protected MeasurementResponseDto buildResponse(String from, String to, Double number) {
        return new WeightService().calculate(this.buildRequestDto(from, to, number));
    }

    @ParameterizedTest
    @ArgumentsSource(MilligramProvider.class)
    public void calculateMilligramTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(GramProvider.class)
    public void calculateGramTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(KilogramProvider.class)
    public void calculateKilogramTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }

    @ParameterizedTest
    @ArgumentsSource(OunceProvider.class)
    public void calculateOunceTest(String from, String to, Double number, Double result) {
        assertEquals(this.buildResponse(from, to, number).getResult(), result);
    }
}
