package org.ysp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author pai
 * @date 2019/5/4
 */
@Data
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {
    /**
     *id
     */
    private Integer id ;

    /**
     * 用户名
     */
    private String username;
    /**
     * 性别
     */
    private String sex;
    /**
     *生日
     */
    private String birthday;
    /**
     *邮箱
     */
    private String email;
    /**
     *微信号
     */
    @JsonProperty("wechatNum")
    private String wechat;
    /**
     *求职状态
     */
    @JsonProperty("currentJobStatus")
    private Integer workStatus;
    /**
     *电话号码
     */
    private String phone;
    /**
     *开始工作时间
     */
    @JsonProperty("startWorkTime")
    private String beginWorkDate;
    /**
     * 几年工作经验
     */
    private String workExperience;
    


}
