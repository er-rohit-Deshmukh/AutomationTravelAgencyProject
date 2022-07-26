package com.cg.ata.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.cg.ata.project.controller.RouteController;
import com.cg.ata.project.model.Route;




@SpringBootTest
public class RouteControllerTest {

	@Autowired
	RouteController rootController;

	@Test
	public void testGetRouteById() {
		assertEquals(1, rootController.viewRouteById(1).getBody().getRouteId());
		
	}
	
	@Test
	@Disabled
	public void testGetRouteById2() {
		assertNotEquals(1, rootController.viewRouteById(2));
	}
	
}