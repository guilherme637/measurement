package com.example.measurement.domain.stragegy;

public interface CalculateStrategy {
    Double calculate(Double value);
    double invertMeasurement(Double value);
}
