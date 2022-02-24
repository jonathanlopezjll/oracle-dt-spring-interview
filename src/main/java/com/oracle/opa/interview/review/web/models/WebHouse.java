package com.oracle.opa.interview.review.web.models;

import com.oracle.opa.interview.review.domain.persistence.entities.House;
import com.oracle.opa.interview.review.domain.persistence.entities.Price;

public class WebHouse {
    private final House house;
    private final Price estimation;

    public WebHouse(House house, Price estimation) {
        this.house = house;
        this.estimation = estimation;
    }

    public Price getEstimation() {
        return estimation;
    }

    public House getHouse() {
        return house;
    }
}
