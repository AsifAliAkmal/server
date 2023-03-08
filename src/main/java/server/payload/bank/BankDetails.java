package server.payload.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class BankDetails {

    @NotBlank(message = "Please enter valid bank name")
    @JsonProperty("name")
    private String name;
    @JsonProperty("post_office")
    @SerializedName("post_office")
    @NotBlank(message = "Please enter valid post office name")
    private String postOffice;

    @NotBlank(message = "Please enter valid district name")
    @JsonProperty("district")
    private String district;

    @JsonProperty("pin_code")
    @SerializedName("pin_code")
    @NotBlank(message = "Please enter valid pin-code")
    @Size(min=6,max=100,message = "Please enter the pin-code of length {min}")
    private Long pinCode;

    @NotBlank(message = "Please enter the valid state name")
    @JsonProperty("state")
    private String state;

    @NotBlank(message = "Please enter valid ifscCode")
    @JsonProperty("ifsc_code")
    @SerializedName("ifsc_code")
    private String ifscCode;
}
