package com.example.measurement.domain.stragegy.temperature.celcius;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CelsiusToKelvin implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value + 273.15;
    }

    @Override
    public double invertMeasurement(Double value) {
        return Math.round(value - 273.15);
    }
}
