package com.example.measurement.domain.stragegy.length.centimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CentimeterToYard implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 91.44;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 91.44;
    }
}
