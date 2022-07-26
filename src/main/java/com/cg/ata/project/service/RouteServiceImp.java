package com.cg.ata.project.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ata.project.exception.RouteNotFoundException;
import com.cg.ata.project.model.Route;
import com.cg.ata.project.repository.RouteRepository;

@Service
public class RouteServiceImp implements RouteService {

	@Autowired
	RouteRepository routeRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	

	public List<Route> viewAllRoutes() {
		LOG.info("viewAllRoute");
		return routeRepository.findAll();
	}

	public Route viewRouteById(int routeId) {
		Optional<Route> rutOptional = routeRepository.findById(routeId);
		Route rou = null;
		if (rutOptional.isPresent()) {
			rou = rutOptional.get();
			LOG.info(rou.toString());
			return rou;
		} else {
			String errorMessage = "RouteId " + routeId + " does not exist.";
			LOG.error(errorMessage);
			throw new RouteNotFoundException(errorMessage);
		}
	}
	

	public Route addRoute(Route route) {
		LOG.info(route.toString());
		return routeRepository.save(route);
	}

	
	public Route modifyRoute(Route route) {
		LOG.info(route.toString());
		this.viewRouteById(route.getRouteId());
		return routeRepository.save(route);
	}
	

	public Route deleteRoute(int routeId) {
		LOG.info(Integer.toString(routeId));
		Route rouToDelete = this.viewRouteById(routeId);
		routeRepository.delete(rouToDelete);
		return rouToDelete;
	}

}
