package com.example.measurement.domain.chain.handler.length.kilometer;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.kilometer.KilometerToMile;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class KilometerToOrMile extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        KilometerToMile strategy = new KilometerToMile();

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILE.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.MILE.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}