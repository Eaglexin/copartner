package com.axia.copartner.controller;


import com.axia.copartner.base.BaseResponse;
import com.axia.copartner.entity.UserInfo;
import com.axia.copartner.service.IUserOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 参数配置 信息操作处理
 * 
 * @author numberone
 */
@Controller
@RequestMapping("/user")
public class SysUserAppController {

    @Autowired
    private IUserOperate operateService;

    @PostMapping("/userLogin")
    @ResponseBody
    public String login(String telephone , String auth) {

        UserInfo mUserInfo = operateService.selectUserByPhoneNumber(telephone);
        if (mUserInfo != null) {

        }




        if ("13232208019".equals(telephone) && "9527".equals(auth)){
            return "UserInfo";
        }

        return "error";
    }

    @PostMapping("/getAuth")
    @ResponseBody
    public BaseResponse getAuth(String telephone){

        UserInfo mUserInfo = operateService.selectUserByPhoneNumber(telephone);
//        return operateService.getAuth(telephone) ;telephone
        return new BaseResponse(0,"获取成功");
    }

}
