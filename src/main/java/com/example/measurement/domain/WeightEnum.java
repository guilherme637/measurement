package com.example.measurement.domain;

import lombok.Getter;

@Getter
public enum WeightEnum {
    MILLIGRAM("Milligram", "mg"),
    GRAM("Gram", "g"),
    KILOGRAM("Kilogram", "kg"),
    OUNCE("Ounce", "oz"),
    POUND("Pound", "lb");

    private final String value;
    private final String abbreviation;

    WeightEnum(String value, String abbreviation) {
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public static String getAbbreviationByFullName(String fullName) {
        for (WeightEnum unit: values()) {
            if (unit.value.equalsIgnoreCase(fullName)) {
                return unit.getAbbreviation();
            }
        }

        return null;
    }
}
