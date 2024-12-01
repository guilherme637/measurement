package com.example.measurement.domain.chain.handler.weight.miligram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.miligram.MilligramToGram;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MilligramToOrGram extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MilligramToGram strategy = new MilligramToGram();

        if (
            dto.getUnitFrom().equals(WeightEnum.MILLIGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.GRAM.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.GRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.MILLIGRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
