package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class KilometerProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Kilometer", "Meter", 1.0, 1_000.0),
                Arguments.of("Kilometer", "Mile", 1.0, 0.621371192237),
                Arguments.of("Kilometer", "Yard", 1.0, 1093.61329834),
                Arguments.of("Meter", "Kilometer", 1_000.0, 1.0),
                Arguments.of("Mile", "Kilometer", 1.0, 1.609344),
                Arguments.of("Yard", "Kilometer", 1.0, 0.0009144)
        );
    }
}
