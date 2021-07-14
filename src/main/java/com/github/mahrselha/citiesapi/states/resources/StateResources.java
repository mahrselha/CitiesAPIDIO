package com.github.mahrselha.citiesapi.states.resources;

import com.github.mahrselha.citiesapi.states.entities.State;
import com.github.mahrselha.citiesapi.states.repository.StateRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResources {

    private final StateRepository repository;

    public StateResources(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}