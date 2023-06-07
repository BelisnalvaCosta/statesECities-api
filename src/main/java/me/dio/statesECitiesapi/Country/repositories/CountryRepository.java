package me.dio.statesECitiesapi.Country.repositories;

import me.dio.statesECitiesapi.Country.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
