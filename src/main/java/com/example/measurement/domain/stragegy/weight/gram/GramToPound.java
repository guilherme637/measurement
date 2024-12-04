package com.example.measurement.domain.stragegy.weight.gram;

import com.example.measurement.domain.stragegy.CalculateStrategy;

public class GramToPound implements CalculateStrategy {
    @Override
    public Double calculate(Double value) {
        return value * 0.00220462262185;
    }

    @Override
    public double invertMeasurement(Double value) {
        return value * 453.59237;
    }
}
