package com.example.measurement.domain.chain.handler.weight.gram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.gram.GramToOunce;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class GramToOrOunce extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        GramToOunce strategy = new GramToOunce();

        if (
            dto.getUnitFrom().equals(WeightEnum.GRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.OUNCE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.OUNCE.getValue())
            && dto.getUnitTo().equals(WeightEnum.GRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
