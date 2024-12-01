package com.example.measurement.domain.stragegy.length.millimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MillimeterToCentimeter implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value / 10;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 10;
    }
}
