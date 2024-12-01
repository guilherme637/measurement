package com.example.measurement.domain.chain.handler.length.centimeter;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.centimeter.CentimeterToFoot;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class CentimeterToOrFoot extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        CentimeterToFoot strategy = new CentimeterToFoot();

        if (
            dto.getUnitFrom().equals(LengthEnum.CENTIMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.FOOT.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.FOOT.getValue())
            && dto.getUnitTo().equals(LengthEnum.CENTIMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
