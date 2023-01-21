package com.emrezorlu.app.demo.airwayflightplan.repository;

import com.emrezorlu.app.demo.airwayflightplan.entity.FlightEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightRepository extends MongoRepository<FlightEntity, String> {
}
