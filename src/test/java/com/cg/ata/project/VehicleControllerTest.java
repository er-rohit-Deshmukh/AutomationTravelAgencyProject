package com.cg.ata.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.ata.project.controller.VehicleController;

@SpringBootTest
 class VehicleControllerTest {

	@Autowired
	VehicleController vehController;

	@Test
	private void testGetVehicleById() {
		assertEquals(1, vehController.viewVehicleById(1).getBody().getVehId());

	}

	@Test
	@Disabled
	void testGetVehicleById2() {
		assertNotEquals(1, vehController.viewVehicleById(2));
	}
}
