package com.example.measurement.domain.chain.handler.length.centimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.centimeter.CentimeterToYard;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CentimeterToOrYard extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CentimeterToYard strategy = new CentimeterToYard();

        if (
            dto.getUnitFrom().equals(LengthEnum.CENTIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.YARD.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.YARD.getValue())
            && dto.getUnitTo().equals(LengthEnum.CENTIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
