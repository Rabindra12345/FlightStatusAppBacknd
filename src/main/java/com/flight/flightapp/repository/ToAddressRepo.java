package com.flight.flightapp.repository;


import com.flight.flightapp.entity.ToAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

public interface ToAddressRepo extends JpaRepository<ToAddress, String> {


    @Query(value = "SELECT DISTINCT * FROM to_address", nativeQuery = true)
    List<String> findDistinctToAddress();
}
