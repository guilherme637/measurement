package com.example.measurement.domain.stragegy.temperature.celcius;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class CelsiusToFahrenheit implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return (value * 9/5) + 32;
    }

    @Override
    public double invertMeasurement(Double value) {
        return (value - 32) * 5/9;
    }
}
