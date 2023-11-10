package com.parkauto.parkauto.dto;

//Data transfer object-DTO sous class,we don't need all the
// info of the user for access only certain info we require.
import lombok.Data;

@Data
public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
