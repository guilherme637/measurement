package com.example.measurement.domain.chain.handler.length.meter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;

import com.example.measurement.domain.stragegy.length.meter.MeterToYard;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MeterToOrYard extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MeterToYard strategy = new MeterToYard();

        if (
            dto.getUnitFrom().equals(LengthEnum.METER.getValue())
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
