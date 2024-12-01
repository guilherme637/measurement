package com.example.measurement.domain.chain.handler.length.millimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.millimeter.MillimeterToFoot;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class MillimeterToOrFoot extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        MillimeterToFoot strategy = new MillimeterToFoot();

        if (
            dto.getUnitFrom().equals(LengthEnum.MILLIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.FOOT.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.FOOT.getValue())
            && dto.getUnitTo().equals(LengthEnum.MILLIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
