package com.example.measurement.domain.stragegy.length.inch;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class InchToKilometer implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.0000254;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 39370.1 ;
    }
}
