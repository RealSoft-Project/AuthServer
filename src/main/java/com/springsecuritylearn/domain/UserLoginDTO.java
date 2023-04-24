package com.springsecuritylearn.domain;

import lombok.Data;

@Data
public class UserLoginDTO {
    private String name;
    private String username;
    private String password;
}
