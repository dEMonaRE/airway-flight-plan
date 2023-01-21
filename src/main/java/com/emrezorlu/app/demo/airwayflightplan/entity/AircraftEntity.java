package com.emrezorlu.app.demo.airwayflightplan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("Aircraft")
public class AircraftEntity {

    @Id
    private String id;
    private String name;
    private String icaoCode;
    private String model;
    private Integer seats;
}
