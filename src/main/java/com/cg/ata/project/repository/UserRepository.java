package com.cg.ata.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.ata.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value="SELECT * from user_table u where u.mobile = ?1 AND password=?2", nativeQuery = true)
	public User validateLogin(long mobileNumber,String password);
	
	@Query(value = "select * from user_table where mobile =?1",nativeQuery = true)
	public Optional<User> findById(long mobileNumber);

	
}
 