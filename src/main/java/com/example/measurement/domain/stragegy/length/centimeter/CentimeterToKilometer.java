package com.example.measurement.domain.stragegy.length.centimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CentimeterToKilometer implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 100000;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 100000;
    }
}
