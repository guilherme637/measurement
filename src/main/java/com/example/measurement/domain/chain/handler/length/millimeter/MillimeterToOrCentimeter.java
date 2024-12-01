package com.example.measurement.domain.chain.handler.length.millimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.millimeter.MillimeterToCentimeter;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MillimeterToOrCentimeter extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MillimeterToCentimeter strategy = new MillimeterToCentimeter();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILLIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.CENTIMETER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.CENTIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILLIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
