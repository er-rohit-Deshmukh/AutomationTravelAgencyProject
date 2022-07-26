package com.cg.ata.project.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ata.project.exception.DriverNotFoundException;
import com.cg.ata.project.model.Driver;
import com.cg.ata.project.repository.DriverRepository;

@Service
public class DriverServiceImp implements DriverService {

	@Autowired
	DriverRepository driveRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Driver> viewAllDriver() {
		LOG.info("viewAllDriver");
		return driveRepository.findAll();
	}

	public Driver viewDriverById(int driverId) {
		Optional<Driver> driOptional = driveRepository.findById(driverId);
		Driver dri = null;
		if (driOptional.isPresent()) {
			dri = driOptional.get();
			LOG.info(dri.toString());
			return dri;
		} else {
			String errorMessage = "Driver with driver " + driverId + " does not exist.";
			LOG.error(errorMessage);
			throw new DriverNotFoundException(errorMessage);
		}
	}

	public Driver addDriver(Driver driver) {
		LOG.info(driver.toString());
		return driveRepository.save(driver);
	}

	public Driver modifyDriver(Driver driver) {
		LOG.info(driver.toString());
		this.viewDriverById(driver.getDriverId());
		return driveRepository.save(driver);
	}

	public Driver deleteDriver(int driverId) {
		LOG.info(Integer.toString(driverId));
		Driver driverToDelete = this.viewDriverById(driverId);
		driveRepository.delete(driverToDelete);
		return driverToDelete;
	}

}
