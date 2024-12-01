package com.example.measurement.controller;

import com.example.measurement.domain.service.length.LengthServiceInterface;
import com.example.measurement.domain.service.temperature.TemperatureServiceInterface;
import com.example.measurement.domain.service.weight.WeightServiceInterface;
import com.example.measurement.presentation.dto.measurement.MeasurementRequestDto;
import com.example.measurement.presentation.dto.measurement.MeasurementResponseDto;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UnitConversionController {
    private final LengthServiceInterface lengthService;
    private final WeightServiceInterface weightService;
    private final TemperatureServiceInterface temperatureService;

    UnitConversionController(
        LengthServiceInterface lengthService,
        WeightServiceInterface weightService,
        TemperatureServiceInterface temperatureService
    ) {
        this.weightService = weightService;
        this.lengthService = lengthService;
        this.temperatureService = temperatureService;
    }

    @GetMapping(path = "/unit")
    public ModelAndView conversorAction() {
        return new ModelAndView("measurement");
    }

    @RequestMapping(path = "/length", method = RequestMethod.POST)
    public ResponseEntity<MeasurementResponseDto> lengthActionPost(MeasurementRequestDto data) {
        MeasurementResponseDto result = this.lengthService.calculate(data);

        return ResponseEntity.ok(result);
    }

    @RequestMapping(path = "/weigth", method = RequestMethod.POST)
    public ResponseEntity<MeasurementResponseDto> weigthActionPut(MeasurementRequestDto data) {
        MeasurementResponseDto result = this.weightService.calculate(data);

        return ResponseEntity.ok(result);
    }

    @RequestMapping(path = "/temperature", method = RequestMethod.POST)
    public ResponseEntity<MeasurementResponseDto> temperatureActionPut(MeasurementRequestDto data) {
        MeasurementResponseDto result = this.temperatureService.calculate(data);

        return ResponseEntity.ok(result);
    }
}
