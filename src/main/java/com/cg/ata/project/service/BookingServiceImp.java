package com.cg.ata.project.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ata.project.exception.BookingNotFoundException;
import com.cg.ata.project.model.Booking;
import com.cg.ata.project.repository.BookingRepository;

@Service
public class BookingServiceImp implements BookingService {

	@Autowired
	BookingRepository bookRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Booking> viewAllBooking() {
		LOG.info("viewAllBooking");
		return bookRepository.findAll();
	}

	public Booking viewBookingById(int bookingId) {
		Optional<Booking> bokOptional = bookRepository.findById(bookingId);
		Booking booking = null;
		if (bokOptional.isPresent()) {
			booking = bokOptional.get();
			LOG.info(booking.toString());
			return booking;
		} else {
			String errorMessage = "Booking with booking " + bookingId + " does not exist.";
			LOG.error(errorMessage);
			throw new BookingNotFoundException(errorMessage);
		}
	}

	public Booking addBooking(Booking booking) {
		LOG.info(booking.toString());
		return bookRepository.save(booking);
	}

	public Booking modifyBooking(Booking booking) {
		LOG.info(booking.toString());
		this.viewBookingById(booking.getBookId());
		return bookRepository.save(booking);
	}

	public Booking cancelBooking(int bookingId) {
		LOG.info(Integer.toString(bookingId));
		Booking bokToDelete = this.viewBookingById(bookingId);
		bookRepository.delete(bokToDelete);
		return bokToDelete;
	}

}
