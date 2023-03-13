package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
