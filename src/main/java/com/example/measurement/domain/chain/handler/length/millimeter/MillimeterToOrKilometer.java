package com.example.measurement.domain.chain.handler.length.millimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.millimeter.MillimeterToKilometer;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MillimeterToOrKilometer extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MillimeterToKilometer strategy = new MillimeterToKilometer();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILLIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILLIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
