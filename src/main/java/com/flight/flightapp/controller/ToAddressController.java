//package com.flight.flightapp.controller;
//
//
//import com.flight.flightapp.entity.ToAddress;
//import com.flight.flightapp.repository.ToAddressRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/")
//public class ToAddressController {
//
//
//    @Autowired
//    private ToAddressRepo toAddRepo;
//
//
//    @CrossOrigin("http://localhost:4200")
//    @GetMapping("/toAddress")
//    public List<String> getAll(){
//
//        return toAddRepo.findDistinctToAddress();
//    }
//}
