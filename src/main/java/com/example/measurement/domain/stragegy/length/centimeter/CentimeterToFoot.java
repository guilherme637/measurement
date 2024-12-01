package com.example.measurement.domain.stragegy.length.centimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CentimeterToFoot implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 30.48;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 30.48;
    }
}
