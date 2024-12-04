package com.example.measurement.service.weight.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class OunceProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Ounce", "Pound", 1.0, 0.0625),
                Arguments.of("Pound", "Ounce", 1.0, 16.0)
        );
    }
}
