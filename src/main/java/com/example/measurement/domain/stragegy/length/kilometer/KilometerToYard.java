package com.example.measurement.domain.stragegy.length.kilometer;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class KilometerToYard implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 1093.61329834;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 0.0009144 ;
    }
}
