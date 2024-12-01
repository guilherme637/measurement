package com.example.measurement.domain.chain.handler.weight.kilogram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.kilogram.KilogramToPound;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class KilogramToOrPound extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        KilogramToPound strategy = new KilogramToPound();

        if (
            dto.getUnitFrom().equals(WeightEnum.KILOGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.POUND.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.POUND.getValue())
            && dto.getUnitTo().equals(WeightEnum.KILOGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}

