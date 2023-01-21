package com.emrezorlu.app.demo.airwayflightplan.repository;

import com.emrezorlu.app.demo.airwayflightplan.entity.AirlineEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirlineRepository extends MongoRepository<AirlineEntity, String> {
}
