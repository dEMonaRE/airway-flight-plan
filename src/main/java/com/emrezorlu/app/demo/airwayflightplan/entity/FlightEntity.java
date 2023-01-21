package com.emrezorlu.app.demo.airwayflightplan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("Flight")
public class FlightEntity {
    @Id
    private String id;
    @NotNull
    @Column(nullable = false, unique = true)
    private String code;
    private AirlineEntity airline;
    private AircraftEntity aircraft;
    private AirportEntity source;
    private AirportEntity destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate flightDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private LocalTime flightTime;
    private Integer flightDuration;
}
