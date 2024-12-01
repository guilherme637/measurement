package com.example.measurement.domain;

import lombok.Getter;

@Getter
public enum LengthEnum {
    MILLIMETER("Millimeter", "mm"),
    CENTIMETER("Centimeter", "cm"),
    METER("Meter", "m"),
    KILOMETER("Kilometer", "km"),
    INCH("Inch", "in"),
    FOOT("Foot", "ft"),
    YARD("Yard", "yd"),
    MILE("Mile", "mi");

    private final String value;
    private final String abbreviation;

    LengthEnum(String value, String abbreviation) {
        this.abbreviation = abbreviation;
        this.value = value;
    }

    public static String getAbbreviationByFullName(String fullName) {
        for (LengthEnum unit: values()) {
            if (unit.value.equalsIgnoreCase(fullName)) {
                return unit.getAbbreviation();
            }
        }

        return null;
    }
}
