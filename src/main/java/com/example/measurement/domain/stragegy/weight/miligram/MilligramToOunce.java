package com.example.measurement.domain.stragegy.weight.miligram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MilligramToOunce implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 28350;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 28350;
    }
}
