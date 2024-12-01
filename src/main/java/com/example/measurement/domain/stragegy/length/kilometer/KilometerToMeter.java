package com.example.measurement.domain.stragegy.length.kilometer;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class KilometerToMeter implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 1000;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value / 1000;
    }
}
