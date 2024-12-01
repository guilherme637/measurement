package com.example.measurement.domain.chain.handler.length.foot;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.foot.FootToMile;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class FootToOrMile extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        FootToMile strategy = new FootToMile();

        if (
            dto.getUnitFrom().equals(LengthEnum.FOOT.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.MILE.getValue())
            && dto.getUnitTo().equals(LengthEnum.FOOT.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
