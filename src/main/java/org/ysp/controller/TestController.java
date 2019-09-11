package org.ysp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ysp.dao.UserInfoDao;
import org.ysp.entity.UserInfo;

import javax.annotation.Resource;

/**
 * @author pai
 * @date 2019/5/7
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private UserInfoDao userInfoDao;

    @RequestMapping("/demo1.do")
    public UserInfo demo1(){
        UserInfo userInfo = userInfoDao.findUserInfoByUserId(1);
        return userInfo;
    }


}
