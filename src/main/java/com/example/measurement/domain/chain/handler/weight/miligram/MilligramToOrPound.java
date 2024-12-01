package com.example.measurement.domain.chain.handler.weight.miligram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.miligram.MilligramToPound;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MilligramToOrPound extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MilligramToPound strategy = new MilligramToPound();

        if (
            dto.getUnitFrom().equals(WeightEnum.MILLIGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.POUND.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.POUND.getValue())
            && dto.getUnitTo().equals(WeightEnum.MILLIGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
