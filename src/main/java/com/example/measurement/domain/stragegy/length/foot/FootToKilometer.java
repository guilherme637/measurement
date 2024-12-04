package com.example.measurement.domain.stragegy.length.foot;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FootToKilometer implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.0003048;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 3280.83989501;
    }
}
