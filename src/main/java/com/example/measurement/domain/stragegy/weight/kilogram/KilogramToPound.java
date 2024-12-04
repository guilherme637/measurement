package com.example.measurement.domain.stragegy.weight.kilogram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class KilogramToPound implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 2.20462262185;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 0.45359237;
    }
}
