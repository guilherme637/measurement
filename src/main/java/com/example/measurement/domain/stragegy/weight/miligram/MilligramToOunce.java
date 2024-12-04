package com.example.measurement.domain.stragegy.weight.miligram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MilligramToOunce implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.0000352739619496;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 35.2739619496;
    }
}
