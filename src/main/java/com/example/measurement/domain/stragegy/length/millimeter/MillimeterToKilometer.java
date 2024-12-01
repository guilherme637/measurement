package com.example.measurement.domain.stragegy.length.millimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MillimeterToKilometer implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 1_000_000;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 1_000_000;
    }
}
