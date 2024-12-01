package com.example.measurement.domain.chain.handler.weight.ounce;

import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.weight.ounce.OunceToPound;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class OnceToOrPound extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        OunceToPound strategy = new OunceToPound();

        if (
            dto.getUnitFrom().equals(WeightEnum.OUNCE.getValue())
            && dto.getUnitTo().equals(WeightEnum.POUND.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(WeightEnum.POUND.getValue())
            && dto.getUnitTo().equals(WeightEnum.OUNCE.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
