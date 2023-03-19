package server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.helper.ApiResponse;
import server.model.Customer;
import server.service.customer.CustomerService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:300/")
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> list =  customerService.findAllCustomer();
        if(list == null){
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(list,HttpStatus.OK);
    }

    @GetMapping("byId/{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Long customerId){
        Customer customer = customerService.getCustomerById(customerId);
        if(customer == null){
            return new ResponseEntity(customer,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(customer,HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> addToDB(@RequestBody Customer customer){
        Customer customer1 = customerService.saveToDB(customer);
        if(customer1 == null){
            return new ResponseEntity<>(new ApiResponse(false,"Failed to create customer."),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new ApiResponse(true,"Customer created successfully."),HttpStatus.BAD_REQUEST);
    }
}
