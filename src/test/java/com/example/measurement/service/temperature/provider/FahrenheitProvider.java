package com.example.measurement.service.temperature.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class FahrenheitProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Fahrenheit", "Kelvin", 25.0, 269.26),
                Arguments.of("Kelvin", "Fahrenheit", 25.0, -414.67)
        );
    }
}
