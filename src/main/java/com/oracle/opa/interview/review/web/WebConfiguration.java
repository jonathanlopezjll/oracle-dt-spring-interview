package com.oracle.opa.interview.review.web;

import com.oracle.opa.interview.review.web.security.WebSecurityConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.oracle.opa.interview.review.web")
public @interface WebConfiguration {}
