package com.oracle.opa.interview.review.domain;

import com.oracle.opa.interview.review.domain.persistence.PersistenceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@PersistenceConfiguration
@ComponentScan("com.oracle.opa.interview.review.domain")
public @interface DomainConfiguration {}
