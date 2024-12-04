package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class MeterProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Meter", "Mile", 1.0, 0.000621371192237),
                Arguments.of("Meter", "Yard", 1.0, 1.09361329834  ),
                Arguments.of("Mile", "Meter", 1.0 , 1609.344),
                Arguments.of("Yard", "Meter", 1.0, 0.9144)
        );
    }
}
