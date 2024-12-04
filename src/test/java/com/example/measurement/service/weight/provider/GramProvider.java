package com.example.measurement.service.weight.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class GramProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Gram", "Kilogram", 1.0, 0.001),
                Arguments.of("Gram", "Ounce", 1.0, 0.0352739619496),
                Arguments.of("Gram", "Pound", 1.0, 0.00220462262185),
                Arguments.of("Kilogram", "Gram", 1.0, 1000.0),
                Arguments.of("Ounce", "Gram", 1.0, 28.349523125),
                Arguments.of("Pound", "Gram", 1.0, 453.59237)
        );
    }
}
