package com.example.measurement.domain.service.length;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.chain.handler.length.centimeter.*;
import com.example.measurement.domain.chain.handler.length.foot.*;
import com.example.measurement.domain.chain.handler.length.inch.*;
import com.example.measurement.domain.chain.handler.length.kilometer.*;
import com.example.measurement.domain.chain.handler.length.meter.*;
import com.example.measurement.domain.chain.handler.length.mile.*;
import com.example.measurement.domain.chain.handler.length.millimeter.*;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import org.springframework.stereotype.Service;

@Service
public class LengthService implements LengthServiceInterface{
    public MeasurementResponseDto calculate(MeasurementRequestDto dto) {
        ResultCalculatorAbstract chain = ResultCalculatorAbstract.add(
            new MillimeterToOrCentimeter(),
            new MillimeterToOrFoot(),
            new MillimeterToOrInch(),
            new MillimeterToOrKilometer(),
            new MillimeterToOrMeter(),
            new MillimeterToOrMile(),
            new MillimeterToOrYard(),
            new CentimeterToOrFoot(),
            new CentimeterToOrInch(),
            new CentimeterToOrKilometer(),
            new CentimeterToOrMeter(),
            new CentimeterToOrMile(),
            new CentimeterToOrYard(),
            new MeterToOrMile(),
            new MeterToOrYard(),
            new KilometerToOrMeter(),
            new KilometerToOrMile(),
            new KilometerToOrYard(),
            new InchToOrKilometer(),
            new InchToOrMeter(),
            new InchToOrMile(),
            new FootToOrInch(),
            new FootToOrKilometer(),
            new FootToOrMeter(),
            new FootToOrMile(),
            new MileToOrYard()
        );

        return MeasurementResponseDto
            .builder()
            .from(dto.getNumber().toString() + " " + LengthEnum.getAbbreviationByFullName(dto.getUnitFrom()))
            .to(LengthEnum.getAbbreviationByFullName(dto.getUnitTo()))
            .result(chain.calculate(dto))
            .build();
    }
}
