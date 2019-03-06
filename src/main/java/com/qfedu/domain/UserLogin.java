package com.qfedu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLogin {
    private Integer id;
    private String username;
    private String password;


}
