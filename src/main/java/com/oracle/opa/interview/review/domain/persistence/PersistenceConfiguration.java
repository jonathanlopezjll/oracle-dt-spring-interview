package com.oracle.opa.interview.review.domain.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.oracle.opa.interview.review.domain.persistence")
public @interface PersistenceConfiguration {}
