package com.example.measurement.domain.stragegy.weight.kilogram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class KilogramToOunce implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 35.2739619496;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 0.028349523125;
    }
}
