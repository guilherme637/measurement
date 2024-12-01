package com.example.measurement.domain.stragegy.length.foot;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FootToInch implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 25.4;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 25.4;
    }
}
