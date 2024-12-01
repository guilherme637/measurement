package com.example.measurement.domain.stragegy.length.centimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CentimeterToInch implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 2.54;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 2.54;
    }
}