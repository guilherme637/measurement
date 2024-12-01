package com.example.measurement.domain.stragegy.temperature.fahrenheit;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class FahrenheitToKelvin implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return (value - 32) * 5/9 + 273.15;
    }

    @Override
    public double invertMeasurement(Double value) {
        return (value - 273.15) * 9/5 + 32;
    }
}
