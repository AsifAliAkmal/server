package server.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import server.payload.bank.BankDetails;

import javax.validation.constraints.Size;

@Entity
@Table(name="bank")
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false,unique = true)
    private String name;
    @Column(name="post_office",nullable = false)
    private String postOffice;

    @Column(name="district",nullable = false)
    private String district;

    @Column(name="pin_code",nullable = false)
    @Size(min=6,max = 6)
    private Long pinCode;

    @Column(name = "state",nullable = false)
    private String state;

    @Column(name="ifsc_code",unique = true,nullable = false)
    private String ifscCode;

    public Bank(BankDetails bankDetails){
        this.name = bankDetails.getName();
        this.postOffice = bankDetails.getPostOffice();
        this.district = bankDetails.getDistrict();
        this.pinCode = bankDetails.getPinCode();
        this.state = bankDetails.getState();
        this.ifscCode = bankDetails.getIfscCode();
    }
}
