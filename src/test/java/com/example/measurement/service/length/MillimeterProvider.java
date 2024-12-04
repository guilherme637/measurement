package com.example.measurement.service.length;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class MillimeterProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Millimeter", "Centimeter", 10.0, 1.0),
                Arguments.of("Millimeter", "Meter", 1000.0, 10.0),
                Arguments.of("Millimeter", "Kilometer", 1_000_000.0, 1.0),
                Arguments.of("Millimeter", "Inch", 2.54, 0.1),
                Arguments.of("Millimeter", "Foot", 304.8, 1.0),
                Arguments.of("Millimeter", "Yard", 914.4, 1.0),
                Arguments.of("Millimeter", "Mile", 1_609_344_000.0, 1.0),
                Arguments.of("Centimeter", "Millimeter", 1.0, 10.0),
                Arguments.of("Meter", "Millimeter", 10.0, 1000.0),
                Arguments.of("Kilometer", "Millimeter", 1.0, 1_000_000.0),
                Arguments.of("Inch", "Millimeter", 0.1, 2.54),
                Arguments.of("Foot", "Millimeter", 1.0, 304.8),
                Arguments.of("Yard", "Millimeter", 1.0, 914.4),
                Arguments.of("Mile", "Millimeter", 1.0, 1_609_344_000.0)
        );
    }
}
