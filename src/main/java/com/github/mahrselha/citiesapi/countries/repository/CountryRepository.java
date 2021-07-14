package com.github.mahrselha.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.mahrselha.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
