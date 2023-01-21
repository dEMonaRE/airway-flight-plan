package com.emrezorlu.app.demo.airwayflightplan.repository;

import com.emrezorlu.app.demo.airwayflightplan.entity.AircraftEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AircraftRepository extends MongoRepository<AircraftEntity, String> {
}
