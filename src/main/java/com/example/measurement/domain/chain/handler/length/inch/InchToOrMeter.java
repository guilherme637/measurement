package com.example.measurement.domain.chain.handler.length.inch;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.stragegy.length.inch.InchToMeter;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public class InchToOrMeter extends ResultCalculatorAbstract {
    @Override
    public Double calculate(MeasurementRequestDto dto) {
        InchToMeter strategy = new InchToMeter();

        if (
            dto.getUnitFrom().equals(LengthEnum.INCH.getValue())
            && dto.getUnitTo().equals(LengthEnum.METER.getValue())
        ) {
            return strategy.calculate(dto.getNumber());
        }

        if (
            dto.getUnitFrom().equals(LengthEnum.METER.getValue())
            && dto.getUnitTo().equals(LengthEnum.INCH.getValue())
        ) {
            return strategy.invertMeasurement(dto.getNumber());
        }

        return checkNext(dto);
    }
}
