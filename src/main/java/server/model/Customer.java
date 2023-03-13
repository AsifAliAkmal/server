package server.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_birth")
    private String dateOfBirth;

    @Column(name="street")
    private String street;

    @Column(name="post_office")
    private String postOffice;

    @Column(name="district")
    private String district;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    @Column(name="pin_code")
    private String pin_code;

    @Column(name="aadhar_card")
    private String aadharCard;

    @Column(name="pan_card")
    private String panCard;
}
