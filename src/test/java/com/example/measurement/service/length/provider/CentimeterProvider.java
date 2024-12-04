package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CentimeterProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Centimeter", "Meter", 100.0, 1.0),
                Arguments.of("Centimeter", "Kilometer", 100_000.0, 1.0),
                Arguments.of("Centimeter", "Inch", 1.0, 0.393700787402),
                Arguments.of("Centimeter", "Foot", 1.0, 0.0328083989501),
                Arguments.of("Centimeter", "Yard", 1.0,  0.010936),
                Arguments.of("Centimeter", "Mile", 1.0, 0.00000621371192237),
                Arguments.of("Meter", "Centimeter", 1.0, 100.0),
                Arguments.of("Kilometer", "Centimeter", 1.0, 100_000.0),
                Arguments.of("Inch", "Centimeter", 1.0, 2.54),
                Arguments.of("Foot", "Centimeter", 1.0, 0.0328083989501),
                Arguments.of("Yard", "Centimeter", 0.010936, 1.0),
                Arguments.of("Mile", "Centimeter", 0.00000621371192237, 1.0)
        );
    }
}
