package com.example.measurement.domain.chain.handler.weight.kilogram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.kilogram.KilogramToOunce;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class KilogramToOrOunce extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        KilogramToOunce strategy = new KilogramToOunce();

        if (
            dto.getUnitFrom().equals(WeightEnum.KILOGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.OUNCE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.OUNCE.getValue())
            && dto.getUnitTo().equals(WeightEnum.KILOGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
