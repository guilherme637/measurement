package com.example.measurement.domain.stragegy.weight.gram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class GramToOunce implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 28.35;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 28.35;
    }
}
