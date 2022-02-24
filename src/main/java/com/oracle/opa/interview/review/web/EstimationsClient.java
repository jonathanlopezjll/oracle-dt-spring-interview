package com.oracle.opa.interview.review.web;

import com.oracle.opa.interview.review.domain.persistence.entities.Price;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@FeignClient(value = "HouseEstimations", url = "http://localhost:3001/")
public interface EstimationsClient {

    @RequestMapping(method = RequestMethod.GET, value = "/house/{id}")
    Price getEstimation(@PathVariable UUID id);

}
