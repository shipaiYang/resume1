package org.ysp.service.impl;

import org.springframework.stereotype.Service;
import org.ysp.dao.UserInfoDao;
import org.ysp.entity.UserInfo;
import org.ysp.entity.WorkStatus;
import org.ysp.service.UserInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pai
 * @date 2019/5/27
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfoById(Integer id) {
        return userInfoDao.findUserInfoByUserId(id);
    }

    @Override
    public List<WorkStatus> getAllWorkStatus() {
        List<WorkStatus> workStatusList = userInfoDao.getAllWorkStatus();
        return workStatusList;
    }
}
