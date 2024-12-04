package com.example.measurement.service.weight.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class KilogramProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Kilogram", "Ounce", 1.0, 35.2739619496),
                Arguments.of("Kilogram", "Pound", 1.0, 2.20462262185),
                Arguments.of("Ounce", "Kilogram", 1.0, 0.028349523125),
                Arguments.of("Pound", "Kilogram", 1.0, 0.45359237)
        );
    }
}
