package com.example.measurement.domain.service.weight;

import com.example.measurement.domain.LengthEnum;
import com.example.measurement.domain.WeightEnum;
import com.example.measurement.domain.chain.ResultCalculatorAbstract;
import com.example.measurement.domain.chain.handler.weight.gram.GramToOrKilogram;
import com.example.measurement.domain.chain.handler.weight.gram.GramToOrOunce;
import com.example.measurement.domain.chain.handler.weight.gram.GramToOrPound;
import com.example.measurement.domain.chain.handler.weight.kilogram.KilogramToOrOunce;
import com.example.measurement.domain.chain.handler.weight.kilogram.KilogramToOrPound;
import com.example.measurement.domain.chain.handler.weight.miligram.MilligramToOrGram;
import com.example.measurement.domain.chain.handler.weight.miligram.MilligramToOrKilogram;
import com.example.measurement.domain.chain.handler.weight.miligram.MilligramToOrOunce;
import com.example.measurement.domain.chain.handler.weight.miligram.MilligramToOrPound;
import com.example.measurement.domain.chain.handler.weight.ounce.OnceToOrPound;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;
import org.springframework.stereotype.Service;

@Service
public class WeightService implements WeightServiceInterface {
    public MeasurementResponseDto calculate(MeasurementRequestDto dto) {
        ResultCalculatorAbstract chain = ResultCalculatorAbstract.add(
            new MilligramToOrGram(),
            new MilligramToOrKilogram(),
            new MilligramToOrOunce(),
            new MilligramToOrPound(),
            new GramToOrKilogram(),
            new GramToOrOunce(),
            new GramToOrPound(),
            new KilogramToOrOunce(),
            new KilogramToOrPound(),
            new OnceToOrPound()
        );

        return MeasurementResponseDto
            .builder()
            .from(dto.getNumber().toString() + " " + WeightEnum.getAbbreviationByFullName(dto.getUnitFrom()))
            .to(WeightEnum.getAbbreviationByFullName(dto.getUnitTo()))
            .result(chain.calculate(dto))
            .build();
    }
}
