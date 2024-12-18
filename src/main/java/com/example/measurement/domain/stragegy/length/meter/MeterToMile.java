package com.example.measurement.domain.stragegy.length.meter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class MeterToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.000621371192237;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 1609.344;
    }
}
