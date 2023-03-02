package server.payload.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BankDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("post_office")
    @SerializedName("post_office")
    private String postOffice;

    @JsonProperty("district")
    private String district;

    @JsonProperty("pin_code")
    @SerializedName("pin_code")
    private Long pinCode;

    @JsonProperty("state")
    private String state;

    @JsonProperty("ifsc_code")
    @SerializedName("ifsc_code")
    private String ifscCode;
}
