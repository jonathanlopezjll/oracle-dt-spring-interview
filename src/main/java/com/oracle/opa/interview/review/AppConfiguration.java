package com.oracle.opa.interview.review;

import com.oracle.opa.interview.review.domain.DomainConfiguration;
import com.oracle.opa.interview.review.web.WebConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@WebConfiguration
@DomainConfiguration
public @interface AppConfiguration {}
