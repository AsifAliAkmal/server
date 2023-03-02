package server.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.helper.ApiResponse;
import server.model.Bank;
import server.payload.bank.BankDetails;
import server.service.bank.BankService;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @GetMapping()
    public ResponseEntity<List<Bank>> findAllBankDetails(){
        List<Bank> list = bankService.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/byId")
    public ResponseEntity<Bank> findBankDetailById(@RequestParam("bankId") Long bankId){
        Bank bank = bankService.findById(bankId);
        if(bank == null){
            return new ResponseEntity(bank,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(bank,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addBank(@RequestBody BankDetails bankDetails){
        ApiResponse response = bankService.addBank(bankDetails);
        if(response.isSuccess()){
            return new ResponseEntity(response,HttpStatus.OK);
        }
        return new ResponseEntity(response,HttpStatus.BAD_REQUEST);
    }
}
