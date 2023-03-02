package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.model.Bank;

import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank,Long> {

}
