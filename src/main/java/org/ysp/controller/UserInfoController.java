package org.ysp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.ysp.entity.UserInfo;
import org.ysp.entity.WorkStatus;
import org.ysp.service.UserInfoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.List;

/**
 * @author pai
 * @date 2019/5/26
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    /**
     * 获取用户基本信息
     * @return
     */
    @RequestMapping("/getUserInfo.do")
    @ResponseBody
    public UserInfo getUserInfo(){
        UserInfo userInfo = userInfoService.getUserInfoById(1);
        userInfo.setWorkExperience(computeWorkExperience(userInfo.getBeginWorkDate()));
        return userInfo;
    }
    private static String computeWorkExperience(String beginWorkTime){
        if(StringUtils.isEmpty(beginWorkTime)){
            return "";
        }
        LocalDate beginWorkDate = YearMonth.parse(beginWorkTime).atDay(30);
        log.info("date:{}",beginWorkDate);
        LocalDate now = LocalDate.now();
        return String.valueOf(Period.between(beginWorkDate,now).getYears());
    }

    /**
     * 工作状态列表
     * @return
     */
    @RequestMapping("/getAllWorkStatus.do")
    @ResponseBody
    public List<WorkStatus> getAllWorkStatus(){
        return userInfoService.getAllWorkStatus();
    }

    /**
     * 保存用户基本信息
     * @param userInfo
     * @return
     */
    @RequestMapping("/saveUserInfo.do")
    @ResponseBody
    public String saveUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return "success";
    }
    /**
     * 保存用户头像
     */
    @RequestMapping(value = "/saveUserPhoto.do",params = "method=Pictureupload",
            headers = "content-type=multipart/*",method = RequestMethod.POST )
    public String saveUserPhoto(MultipartFile file, HttpServletRequest req){

        System.out.println(file.getName());
        return null;
    }

//    public static void main(String[] args) {
//        String result = computeWorkExperience("2012-06");
//        log.info(result);
//    }
}
