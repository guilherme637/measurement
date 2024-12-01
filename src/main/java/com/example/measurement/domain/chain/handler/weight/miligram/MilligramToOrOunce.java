package com.example.measurement.domain.chain.handler.weight.miligram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.miligram.MilligramToOunce;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MilligramToOrOunce extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MilligramToOunce strategy = new MilligramToOunce();

        if (
            dto.getUnitFrom().equals(WeightEnum.MILLIGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.OUNCE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.OUNCE.getValue())
            && dto.getUnitTo().equals(WeightEnum.MILLIGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}