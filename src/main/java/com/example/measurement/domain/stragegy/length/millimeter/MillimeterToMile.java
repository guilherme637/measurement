package com.example.measurement.domain.stragegy.length.millimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MillimeterToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 1_609_344_000;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 1_609_344_000;
    }
}
