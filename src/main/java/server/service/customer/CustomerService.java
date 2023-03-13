package server.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.helper.ApiResponse;
import server.model.Customer;
import server.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer getCustomerById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Customer saveToDB(Customer customer){
        return repository.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return repository.findAll();
    }

}
