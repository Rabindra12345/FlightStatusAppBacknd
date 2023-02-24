package com.flight.flightapp.repository;

//import com.flight.flightapp.entity.LoginResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.flight.flightapp.entity.LoginUser;


public interface LoginRepository extends JpaRepository<LoginUser, Long> {

//    @Query(value = "SELECT * FROM users WHERE username = ?1 AND password = ?2", nativeQuery = true)
//    LoginResponse findByUsernameAndPassword(String username, String password);

//    LoginUser findByUsername(String username);

    LoginUser findByUsernameAndPassword(String username, String password);
}
