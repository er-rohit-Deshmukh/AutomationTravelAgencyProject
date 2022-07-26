package com.cg.ata.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.annotation.Rollback;

import com.cg.ata.project.controller.RouteController;
import com.cg.ata.project.model.Driver;
import com.cg.ata.project.repository.DriverRepository;

public class DriverController 
{
	@Autowired
	DriverRepository driverRepository;
	

	@Autowired
	RouteController driverController;

	
	
}
