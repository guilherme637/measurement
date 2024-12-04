package com.example.measurement.domain.stragegy.length.kilometer;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class KilometerToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.621371192237;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 1.609344;
    }
}
