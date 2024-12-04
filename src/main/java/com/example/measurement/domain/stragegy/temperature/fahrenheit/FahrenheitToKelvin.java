package com.example.measurement.domain.stragegy.temperature.fahrenheit;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FahrenheitToKelvin implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return ((value + 459.67) * 5) / 9;
    }

    @Override
    public double invertMeasurement(Double value) {
        return ((value * 9) / 5) - 459.67;
    }
}
