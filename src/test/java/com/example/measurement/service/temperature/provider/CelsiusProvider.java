package com.example.measurement.service.temperature.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CelsiusProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Celsius", "Fahrenheit", 25.0, 77.0),
                Arguments.of("Celsius", "Kelvin", 25.0, 298.15),
                Arguments.of("Fahrenheit", "Celsius", 25.0, -3.89),
                Arguments.of("Kelvin", "Celsius", 25.0, -248.0)
        );
    }
}
