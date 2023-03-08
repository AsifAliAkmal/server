package server.service.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.exception.BadRequestException;
import server.helper.ApiResponse;
import server.model.Bank;
import server.payload.bank.BankDetails;
import server.repository.BankRepository;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankRepository repository;
    public Bank findById(Long id){
        Bank bank =  repository.findById(id).orElse(null);
        if(bank == null){
            throw new BadRequestException("Bank details not found.");
        }
        return bank;
    }

    public Bank saveToDB(Bank bank){
        return repository.save(bank);
    }

    public List<Bank> findAll(){
        return repository.findAll();
    }

    public ApiResponse addBank(BankDetails bankDetails){
        Bank bank = new Bank(bankDetails);
        bank = saveToDB(bank);
        ApiResponse response = new ApiResponse(false,"Failed to add bank.");
        if(bank != null){
            response.setMessage("Bank Successfully added.");
            response.setSuccess(true);
        }
        return response;
    }
}
