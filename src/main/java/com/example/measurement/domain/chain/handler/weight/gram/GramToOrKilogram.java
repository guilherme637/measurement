package com.example.measurement.domain.chain.handler.weight.gram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.gram.GramToKilogram;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class GramToOrKilogram extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        GramToKilogram strategy = new GramToKilogram();

        if (
            dto.getUnitFrom().equals(WeightEnum.GRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.KILOGRAM.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.KILOGRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.GRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}