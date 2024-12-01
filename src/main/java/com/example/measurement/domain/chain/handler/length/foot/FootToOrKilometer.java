package com.example.measurement.domain.chain.handler.length.foot;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.foot.FootToKilometer;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class FootToOrKilometer extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        FootToKilometer strategy = new FootToKilometer();

        if (
            dto.getUnitFrom().equals(LengthEnum.FOOT.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.FOOT.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
