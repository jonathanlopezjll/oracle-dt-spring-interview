package com.oracle.opa.interview.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertThat(3).isOdd();
	}

}
