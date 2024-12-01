package com.example.measurement.domain.chain.handler.weight.gram;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.gram.GramToPound;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class GramToOrPound extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        GramToPound strategy = new GramToPound();

        if (
            dto.getUnitFrom().equals(WeightEnum.GRAM.getValue())
            && dto.getUnitTo().equals(WeightEnum.POUND.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.POUND.getValue())
            && dto.getUnitTo().equals(WeightEnum.GRAM.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
