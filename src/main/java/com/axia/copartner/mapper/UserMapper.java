package com.axia.copartner.mapper;

import com.axia.copartner.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 通过手机号码查询用户
     *
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
     UserInfo selectUserByPhoneNumber(String phoneNumber);

    /**
     * 修改用户详细信息
     *
     * @param user 用户信息
     * @return 结果
     */
     int updateUserInfo(UserInfo user);

}
