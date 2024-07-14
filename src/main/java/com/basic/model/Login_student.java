package com.basic.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class Login_student {
    @NotBlank(message = "minimum 8 chars")
    @Size(min = 8, message = "enter minimum 8 characters")
    String username;
    @NotBlank(message = "enter minimum 8 chars")
    @Size(message = "minimum 8 chars")
    String password;

}
