package com.xiiaoadong.request_param.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    @JsonIgnore
    private Integer age;
}
