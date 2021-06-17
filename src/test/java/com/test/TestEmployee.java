package com.test;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestEmployee {

int i=5;
	@Test
@Order(1)
public	void testSave() {
		System.out.println("from save");
	}
	
	
	@Test
	@Order(3)
public	void testUpdate() {
		System.out.println("from Update");
	}
	
	@Test
	@Order(2)
public	void testDelete() {
		System.out.println("from Delete");
	}
	
}
