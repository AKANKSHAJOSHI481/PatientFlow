package com.pm.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {
    @NotBlank(message = "email is required")
    @Email(message = "email should be a valid email address")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min=8, message = "Password must be alteast 8 characters long")
    private String password;

}
