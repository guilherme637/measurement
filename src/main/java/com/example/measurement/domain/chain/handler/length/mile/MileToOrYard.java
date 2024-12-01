package com.example.measurement.domain.chain.handler.length.mile;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.mile.MileToYard;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MileToOrYard extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MileToYard strategy = new MileToYard();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILE.getValue())
            && dto.getUnitTo().equals(LengthEnum.YARD.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.YARD.getValue())
            && dto.getUnitTo().equals(LengthEnum.METER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
