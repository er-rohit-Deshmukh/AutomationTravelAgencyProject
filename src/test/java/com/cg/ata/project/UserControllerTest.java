//package com.cg.ata.project;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cg.ata.project.model.User;
//import com.cg.ata.project.repository.UserRepository;
//import com.cg.ata.project.service.IUserService;
//
//@SpringBootTest
//class CustomerTest {
//
//	@Autowired
//	UserRepository urepo;
//	
//	@Autowired
//	IUserService service;
//	
//	@Test
//	 void adduserTest() {
//		
//		User c = new User("aniket","7028590095","ani@123",new Booking(1, new BigDecimal(2000)));
//		
//		urepo.save(c);
//		assertEquals(c.getMobileNumber(), urepo.save(c).getMobileNumber());
//	}
//	
//	@Test
//	void validateLoginTest() {
//		
//		Customer c = new Customer("shantanu", "1234567890", "Shantanu@123",new Wallet(1, new BigDecimal(2000)));
//		
//		urepo.save(c);
//		
//		assertNotNull(urepo.validateLogin(c.getMobileNumber(), c.getPassword()));
//		assertEquals(c.getPassword(), urepo.validateLogin(c.getMobileNumber(), c.getPassword()).getPassword());	
//		
//	}
//	
//	@Test
//	void validateLoginExceptionTest() {
//		assertThrows(InvalidLogin.class, ()->service.validateLogin("1234567890", "jjj"));
//	}
//	
//}
//
//
//
