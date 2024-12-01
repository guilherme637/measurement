package com.example.measurement.domain.chain.handler.length.millimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.millimeter.MillimeterToYard;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MillimeterToOrYard extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MillimeterToYard strategy = new MillimeterToYard();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILLIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.YARD.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.YARD.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILLIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
