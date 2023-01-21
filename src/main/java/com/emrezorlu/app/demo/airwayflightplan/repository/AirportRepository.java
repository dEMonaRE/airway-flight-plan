package com.emrezorlu.app.demo.airwayflightplan.repository;

import com.emrezorlu.app.demo.airwayflightplan.entity.AirportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends MongoRepository<AirportEntity, String> {
}
