package com.example.measurement.domain.chain.handler.temperature.fahrenheit;

import com.example.measurement.domain.TemperatureEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.temperature.fahrenheit.FahrenheitToKelvin;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class FahrenheitToOrKelvin extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        FahrenheitToKelvin strategy = new FahrenheitToKelvin();

        if (
            dto.getUnitFrom().equals(TemperatureEnum.FAHRENHEIT.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.KELVIN.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(TemperatureEnum.KELVIN.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.FAHRENHEIT.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
