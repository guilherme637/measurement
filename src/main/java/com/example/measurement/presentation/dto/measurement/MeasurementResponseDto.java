package com.example.measurement.presentation.dto.measurement;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Builder
@Setter
public class MeasurementResponseDto {
    private String from;
    private String to;
    private Double result;
}
