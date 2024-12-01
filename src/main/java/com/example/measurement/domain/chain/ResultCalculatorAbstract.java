package com.example.measurement.domain.chain;

import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;

public abstract class ResultCalculatorAbstract {
    private ResultCalculatorAbstract next;

    public static ResultCalculatorAbstract add(ResultCalculatorAbstract first, ResultCalculatorAbstract... chain) {
        ResultCalculatorAbstract head = first;

        for (ResultCalculatorAbstract nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    public abstract Double calculate(MeasurementRequestDto dto);

    protected double checkNext(MeasurementRequestDto dto) {
        if (next == null) {
            return 0.00;
        }
        
        return next.calculate(dto);
    }
}
