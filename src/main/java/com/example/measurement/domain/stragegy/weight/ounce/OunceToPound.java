package com.example.measurement.domain.stragegy.weight.ounce;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class OunceToPound implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 16;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 16;
    }
}
