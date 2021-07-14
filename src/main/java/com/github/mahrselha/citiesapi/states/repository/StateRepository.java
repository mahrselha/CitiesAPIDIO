package com.github.mahrselha.citiesapi.states.repository;

import com.github.mahrselha.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}