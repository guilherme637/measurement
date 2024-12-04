package com.example.measurement.domain.stragegy.length.foot;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FootToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.000189393939394;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 5280;
    }
}
