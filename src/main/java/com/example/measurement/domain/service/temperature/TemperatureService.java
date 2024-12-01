package com.example.measurement.domain.service.temperature;

import com.example.measurement.domain.TemperatureEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.chain.handler.temperature.celcius.CelsiusToOrFahrenheit;
import com.example.measurement.domain.chain.handler.temperature.celcius.CelsiusToOrKelvin;
import com.example.measurement.domain.chain.handler.temperature.fahrenheit.FahrenheitToOrKelvin;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService implements TemperatureServiceInterface
{
    @Override
    public MeasurementResponseDto calculate(MeasurementRequestDto dto) {
        ResultCalculatorAbstract chain = ResultCalculatorAbstract.add(
            new CelsiusToOrFahrenheit(),
            new CelsiusToOrKelvin(),
            new FahrenheitToOrKelvin()
        );

        String abbreviation = TemperatureEnum.getAbbreviationByFullName(dto.getUnitFrom());
        Double format = Math.round(chain.calculate(dto) * 100.0) / 100.0;

        return MeasurementResponseDto
            .builder()
            .from(dto.getNumber().toString() + " " + abbreviation)
            .to(TemperatureEnum.getAbbreviationByFullName(dto.getUnitTo()))
            .result(format)
            .build();
    }
}
