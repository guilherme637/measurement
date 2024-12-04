package com.example.measurement.domain.stragegy.weight.gram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class GramToOunce implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.0352739619496;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 28.349523125;
    }
}
