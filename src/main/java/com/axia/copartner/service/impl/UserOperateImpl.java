package com.axia.copartner.service.impl;

import com.axia.copartner.base.BaseResponse;
import com.axia.copartner.entity.UserInfo;
import com.axia.copartner.mapper.UserMapper;
import com.axia.copartner.service.IUserOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserOperateImpl implements IUserOperate {
    /**
     *
     */
    @Autowired
    UserMapper userMapper;

    @Autowired
    private IUserOperate operateService;


    @Override
    public BaseResponse<UserInfo> getAuth(String phoneNumber) {
        UserInfo mUserInfo = operateService.selectUserByPhoneNumber(phoneNumber);
        if (null == mUserInfo){
            return new BaseResponse<>(1,"失败");
        }
        String auth = ((Math.random()*9+1)*100000) + "";
        mUserInfo.setAuth(auth);
        int code =  userMapper.updateUserInfo(mUserInfo) ;
        return new BaseResponse<UserInfo>(0,"成功",mUserInfo);
    }

    @Override
    @ResponseBody
    public UserInfo selectUserByPhoneNumber(String phoneNumber) {
        return userMapper.selectUserByPhoneNumber(phoneNumber);
    }

    @Override
    public int updateUserAuth(UserInfo mUserInfo) {
        return 0;
    }
}
