package com.example.measurement.domain.stragegy.length.inch;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class InchToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 63360;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 63360;
    }
}
