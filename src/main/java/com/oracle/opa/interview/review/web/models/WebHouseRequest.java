package com.oracle.opa.interview.review.web.models;

import com.oracle.opa.interview.review.domain.persistence.entities.Address;
import com.oracle.opa.interview.review.domain.persistence.entities.House;
import com.oracle.opa.interview.review.domain.persistence.entities.Person;
import com.oracle.opa.interview.review.domain.persistence.entities.Price;

public class WebHouseRequest extends House {

    public WebHouseRequest(Person owner, Address address, Price price) {
        super(owner, address, price);
    }

}
