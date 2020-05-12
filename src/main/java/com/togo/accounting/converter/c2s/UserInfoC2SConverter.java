package com.togo.accounting.converter.c2s;

import com.togo.accounting.model.common.UserInfo;

import com.google.common.base.Converter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



@Component
@NoArgsConstructor
public class UserInfoC2SConverter extends Converter<UserInfo, com.togo.accounting.model.service.UserInfo> {

    @Override
    protected com.togo.accounting.model.service.UserInfo doForward(UserInfo userInfo) {
        return com.togo.accounting.model.service.UserInfo.builder()
                                                 .id(userInfo.getId())
                                                 .username(userInfo.getUsername())
                                                 .build();
    }

    @Override
    protected UserInfo doBackward(com.togo.accounting.model.service.UserInfo userInfo) {
        return UserInfo.builder()
                       .id(userInfo.getId())
                       .username(userInfo.getUsername())
                       .password(userInfo.getPassword())
                       .build();
    }
}
