package com.aminalmatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalMatchApplicationTests {

	@Test
	void contextLoads() {
		int result = 1 + 2;
		
		int three = 3;
		
		assertEquals(result, three);
	}

}
