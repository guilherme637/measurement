package com.example.measurement.domain.chain.handler.temperature.celcius;

import com.example.measurement.domain.TemperatureEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.temperature.celcius.CelsiusToKelvin;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CelsiusToOrKelvin extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CelsiusToKelvin strategy = new CelsiusToKelvin();

        if (
            dto.getUnitFrom().equals(TemperatureEnum.CELSIUS.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.KELVIN.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(TemperatureEnum.KELVIN.getValue())
            && dto.getUnitTo().equals(TemperatureEnum.CELSIUS.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
