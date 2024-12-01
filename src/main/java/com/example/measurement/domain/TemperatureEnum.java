package com.example.measurement.domain;

import lombok.Getter;

@Getter
public enum TemperatureEnum {
    CELSIUS("Celsius", "°C"),
    FAHRENHEIT("Fahrenheit", "°F"),
    KELVIN("Kelvin", "K");

    private final String value;
    private final String abbreviation;

    TemperatureEnum(String value, String abbreviation) {
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public static String getAbbreviationByFullName(String fullName) {
        for (TemperatureEnum unit: values()) {
            if (unit.value.equalsIgnoreCase(fullName)) {
                return unit.getAbbreviation();
            }
        }

        return null;
    }
}
