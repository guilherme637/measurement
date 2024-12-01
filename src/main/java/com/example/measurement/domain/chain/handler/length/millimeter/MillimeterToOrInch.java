package com.example.measurement.domain.chain.handler.length.millimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.millimeter.MillimeterToInch;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MillimeterToOrInch extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MillimeterToInch strategy = new MillimeterToInch();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILLIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.INCH.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.INCH.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILLIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}