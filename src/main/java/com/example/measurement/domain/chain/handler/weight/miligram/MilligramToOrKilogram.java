package com.example.measurement.domain.chain.handler.weight.miligram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.miligram.MilligramToKilogram;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MilligramToOrKilogram extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MilligramToKilogram strategy = new com.example.measurement.domain.stragegy.weight.miligram.MilligramToKilogram();

        if (
            dto.getUnitFrom().equals(WeightEnum.MILLIGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.KILOGRAM.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.KILOGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.MILLIGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
