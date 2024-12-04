package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class FootProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Foot", "Inch", 1.0, 12.0),
                Arguments.of("Foot", "Kilometer", 1.0, 0.0003048),
                Arguments.of("Foot", "Meter", 1.0, 0.3048),
                Arguments.of("Foot", "Mile", 1.0, 0.000189393939394),
                Arguments.of("Inch", "Foot", 1.0, 0.0833333333333),
                Arguments.of("Kilometer", "Foot", 1.0, 3280.83989501),
                Arguments.of("Meter", "Foot", 1.0, 3.28083989501),
                Arguments.of("Mile", "Foot", 1.0, 5280.0)
        );
    }
}
