package com.example.measurement.domain.chain.handler.length.foot;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.foot.FootToMeter;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class FootToOrMeter extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        FootToMeter strategy = new FootToMeter();

        if (
            dto.getUnitFrom().equals(LengthEnum.FOOT.getValue())
            && dto.getUnitTo().equals(LengthEnum.METER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.METER.getValue())
            && dto.getUnitTo().equals(LengthEnum.FOOT.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
