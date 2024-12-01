package com.example.measurement.domain.stragegy.length.foot;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FootToMeter implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 3.281;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 3.281;
    }
}
