package com.example.measurement.service.length;


import com.example.measurement.domain.service.length.LegthService;
import com.example.measurement.domain.service.length.LengthServiceInterface;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LegthServiceTest {

    @ParameterizedTest
    @ArgumentsSource(LengthProvider.class)
    public void calculateTest(String from, String to, Double number, Double result) {
        MeasurementRequestDto measurementRequestDto = new MeasurementRequestDto();
        measurementRequestDto.setNumber(number);
        measurementRequestDto.setUnitFrom(from);
        measurementRequestDto.setUnitTo(to);

        LengthServiceInterface lengthService = new LegthService();
        System.out.println(from);
        System.out.println(to);

        assertEquals(lengthService.calculate(measurementRequestDto).getResult(), result);
    }

}
