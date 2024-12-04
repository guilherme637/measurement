package com.example.measurement.domain.stragegy.length.centimeter;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CentimeterToMile implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.00000621371192237;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value / 0.00000621371192237;
    }
}
