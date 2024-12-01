package com.example.measurement.presentation.dto.measurement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MeasurementRequestDto {
    private Double number;
    private String unitFrom;
    private String unitTo;
}
