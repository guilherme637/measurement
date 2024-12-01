package com.example.measurement.domain.chain.handler.length.kilometer;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.kilometer.KilometerToMeter;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class KilometerToOrMeter extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        KilometerToMeter strategy = new KilometerToMeter();

        if (
            dto.getUnitFrom().equals(LengthEnum.KILOMETER.getValue())
            && dto.getUnitTo().equals(LengthEnum.METER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.METER.getValue())
            && dto.getUnitTo().equals(LengthEnum.KILOMETER.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
