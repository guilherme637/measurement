package com.example.measurement.domain.chain.handler.length.centimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.centimeter.CentimeterToKilometer;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CentimeterToOrKilometer extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CentimeterToKilometer strategy = new CentimeterToKilometer();

        if (
            dto.getUnitFrom().equals(LengthEnum.CENTIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.CENTIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
