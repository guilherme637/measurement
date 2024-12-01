package com.example.measurement.domain.chain.handler.length.inch;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.inch.InchToKilometer;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class InchToOrKilometer extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        InchToKilometer strategy = new InchToKilometer();

        if (
            dto.getUnitFrom().equals(LengthEnum.INCH.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.INCH.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
