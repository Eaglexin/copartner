package com.axia.copartner.service;

import com.axia.copartner.base.BaseResponse;
import com.axia.copartner.entity.UserInfo;

public interface IUserOperate {

        BaseResponse<UserInfo> getAuth(String phoneName);


        UserInfo selectUserByPhoneNumber(String phoneNumber) ;

        int updateUserAuth(UserInfo mUserInfo) ;



}
