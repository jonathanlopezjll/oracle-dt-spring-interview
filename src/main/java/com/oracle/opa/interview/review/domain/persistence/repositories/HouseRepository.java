package com.oracle.opa.interview.review.domain.persistence.repositories;

import com.oracle.opa.interview.review.domain.persistence.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {}
