package com.example.measurement.domain.stragegy.length.mile;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MileToYard implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 1760;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value / 1760;
    }
}
