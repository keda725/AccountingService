package com.togo.accounting.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private Long id;
    private String username;
    private String salt;
    private String password;
}
