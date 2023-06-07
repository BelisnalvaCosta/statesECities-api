package me.dio.statesECitiesapi.State.repositories;

import me.dio.statesECitiesapi.State.entities.State;
import org.springframework.data.geo.GeoResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Long> {
    GeoResult<State> findByDdd(List<Integer> ddd);
}
