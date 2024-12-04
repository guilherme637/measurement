package com.example.measurement.service.length.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class InchProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Inch", "Meter", 1.0, 0.0254),
                Arguments.of("Inch", "Kilometer", 1.0, 0.0000157828282828),
                Arguments.of("Inch", "Mile", 1.0, 0.0000157828),
                Arguments.of("Meter", "Inch", 1.0, 39.3700787402),
                Arguments.of("Kilometer", "Inch", 1.0, 39370.1),
                Arguments.of("Mile", "Inch", 1.0, 0.0000157828282828)
        );
    }
}
