package org.ysp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ysp.entity.UserInfo;
import org.ysp.entity.WorkStatus;

import java.util.List;

@Mapper
public interface UserInfoDao{


    /**
     * 通过id查找用户信息
     * @param id
     * @return
     */
    UserInfo findUserInfoByUserId(Integer id);

    /**
     * 查找所有求职状态
     * @return
     */
    List<WorkStatus> getAllWorkStatus();


}
