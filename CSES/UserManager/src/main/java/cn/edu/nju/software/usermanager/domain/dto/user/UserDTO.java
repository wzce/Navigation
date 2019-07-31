package cn.edu.nju.software.usermanager.domain.dto.user;

import cn.edu.nju.software.usermanager.domain.dto.BaseDTO;
import cn.edu.nju.software.usermanager.domain.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO extends BaseDTO<User>{

    private Integer id;

    private String mobile;

    private String password;

    private Integer validation;

    private String nickName;

    private String file;

    private String company;

    private String location;

    private Integer invitationCount;

    private String sex;

    private String weixin;

    private Integer collectNum;

    private String activityNum;

    private String verifyCode;

    private String accessToken;

    private Date expireTime;

    private Date vipStartTime;

    private Date vipEndTime;

    private Integer businessId;

    private Integer isVip;

    private Integer isAdmin;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    private Integer deleteFlag;

    private String rongCloudToken;

    private String wechatOpenId;

    private String wechatAccessToken;

    private String wechatRefreshToken;

    private String wxUnionId;

    private String outtradeno;

    private String email;

    private String wxSessionKey;

    private Long bindingId;

    private Date lastInformTime;

    private String extend;

    @Override
    public boolean checkLegal() {
        return false;
    }
}
