package com.example.measurement.domain.chain.handler.temperature.celcius;

import com.example.measurement.domain.TemperatureEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.temperature.celcius.CelsiusToFahrenheit;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CelsiusToOrFahrenheit extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CelsiusToFahrenheit strategy = new CelsiusToFahrenheit();

        if (
            dto.getUnitFrom().equals(TemperatureEnum.CELSIUS.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.FAHRENHEIT.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(TemperatureEnum.FAHRENHEIT.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.CELSIUS.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
