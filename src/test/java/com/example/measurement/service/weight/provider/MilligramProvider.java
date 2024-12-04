package com.example.measurement.service.weight.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class MilligramProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Milligram", "Gram", 1.0, 0.001),
                Arguments.of("Milligram", "Kilogram", 1.0, 0.000001),
                Arguments.of("Milligram", "Ounce", 1.0, 0.0000352739619496),
                Arguments.of("Milligram", "Pound", 1.0, 0.00000220462262185),
                Arguments.of("Gram", "Milligram", 1.0, 1000.0),
                Arguments.of("Kilogram", "Milligram", 1.0, 1_000_000.0),
                Arguments.of("Ounce", "Milligram", 1.0, 35.2739619496),
                Arguments.of("Pound", "Milligram", 1.0, 453592.37)
        );
    }
}
