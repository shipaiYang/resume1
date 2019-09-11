package org.ysp.service;

import org.ysp.entity.UserInfo;
import org.ysp.entity.WorkStatus;

import java.util.List;

/**
 * @author pai
 * @date 2019/5/12
 */

public interface UserInfoService {

    UserInfo getUserInfoById(Integer id);


    List<WorkStatus> getAllWorkStatus();




}
