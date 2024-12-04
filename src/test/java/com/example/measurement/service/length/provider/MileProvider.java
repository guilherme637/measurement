package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class MileProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Mile", "Yard", 1.0, 1760.0),
                Arguments.of("Yard", "Mile", 1.0, 0.000568181818182)
        );
    }
}
