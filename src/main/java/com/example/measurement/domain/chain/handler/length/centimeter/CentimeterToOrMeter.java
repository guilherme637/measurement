package com.example.measurement.domain.chain.handler.length.centimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.centimeter.CentimeterToMeter;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CentimeterToOrMeter extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CentimeterToMeter strategy = new CentimeterToMeter();

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
