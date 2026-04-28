package com.pm.authservice.dto;


public class LoginResponseDTO {
    private String Token;
    public LoginResponseDTO(String token) {
        Token = token;
    }

    public String getToken() {
        return Token;
    }
}
