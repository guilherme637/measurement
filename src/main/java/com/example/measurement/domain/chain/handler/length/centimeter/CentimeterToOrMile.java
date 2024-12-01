package com.example.measurement.domain.chain.handler.length.centimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.centimeter.CentimeterToMile;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CentimeterToOrMile extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CentimeterToMile strategy = new CentimeterToMile();

        if (
            dto.getUnitFrom().equals(LengthEnum.CENTIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.MILE.getValue())
            && dto.getUnitTo().equals(LengthEnum.CENTIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
