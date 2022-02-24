package com.oracle.opa.interview.review.web.controllers;

import com.oracle.opa.interview.review.domain.persistence.entities.Address;
import com.oracle.opa.interview.review.domain.persistence.entities.House;
import com.oracle.opa.interview.review.domain.persistence.entities.Person;
import com.oracle.opa.interview.review.domain.persistence.entities.Price;
import com.oracle.opa.interview.review.domain.persistence.repositories.HouseRepository;
import com.oracle.opa.interview.review.web.EstimationsClient;
import com.oracle.opa.interview.review.web.models.WebHouse;
import com.oracle.opa.interview.review.web.models.WebHouseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;
    @Autowired
    private EstimationsClient estimationsClient;

    @GetMapping(value = "/houses")
    public List<WebHouse> all() {
        return houseRepository.findAll().stream().map(h -> {
            return new WebHouse(h, estimationsClient.getEstimation(h.getId()));
        }).collect(Collectors.toList());
    }

    @PostMapping(value = "/houses")
    public ResponseEntity<String> createHouse(@RequestBody final WebHouseRequest webHouseRequest) {
        final House newHouse = new House(webHouseRequest.getOwner(), webHouseRequest.getAddress(), webHouseRequest.getPrice());
        houseRepository.save(newHouse);
        return new ResponseEntity<>("House created", HttpStatus.CREATED);
    }

}
