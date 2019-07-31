package cn.edu.nju.software.usermanager.domain.entity;

import cn.edu.nju.software.usermanager.domain.dto.BaseDTO;
import cn.edu.nju.software.usermanager.domain.dto.user.UserDTO;

import java.util.Date;

public class User extends BaseEntity<UserDTO>{
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getValidation() {
        return validation;
    }

    public void setValidation(Integer validation) {
        this.validation = validation;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getInvitationCount() {
        return invitationCount;
    }

    public void setInvitationCount(Integer invitationCount) {
        this.invitationCount = invitationCount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public String getActivityNum() {
        return activityNum;
    }

    public void setActivityNum(String activityNum) {
        this.activityNum = activityNum;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getVipStartTime() {
        return vipStartTime;
    }

    public void setVipStartTime(Date vipStartTime) {
        this.vipStartTime = vipStartTime;
    }

    public Date getVipEndTime() {
        return vipEndTime;
    }

    public void setVipEndTime(Date vipEndTime) {
        this.vipEndTime = vipEndTime;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRongCloudToken() {
        return rongCloudToken;
    }

    public void setRongCloudToken(String rongCloudToken) {
        this.rongCloudToken = rongCloudToken;
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId;
    }

    public String getWechatAccessToken() {
        return wechatAccessToken;
    }

    public void setWechatAccessToken(String wechatAccessToken) {
        this.wechatAccessToken = wechatAccessToken;
    }

    public String getWechatRefreshToken() {
        return wechatRefreshToken;
    }

    public void setWechatRefreshToken(String wechatRefreshToken) {
        this.wechatRefreshToken = wechatRefreshToken;
    }

    public String getWxUnionId() {
        return wxUnionId;
    }

    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWxSessionKey() {
        return wxSessionKey;
    }

    public void setWxSessionKey(String wxSessionKey) {
        this.wxSessionKey = wxSessionKey;
    }

    public Long getBindingId() {
        return bindingId;
    }

    public void setBindingId(Long bindingId) {
        this.bindingId = bindingId;
    }

    public Date getLastInformTime() {
        return lastInformTime;
    }

    public void setLastInformTime(Date lastInformTime) {
        this.lastInformTime = lastInformTime;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static User.Builder builder() {
        return new User.Builder();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getValidation() == null ? other.getValidation() == null : this.getValidation().equals(other.getValidation()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getFile() == null ? other.getFile() == null : this.getFile().equals(other.getFile()))
            && (this.getCompany() == null ? other.getCompany() == null : this.getCompany().equals(other.getCompany()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getInvitationCount() == null ? other.getInvitationCount() == null : this.getInvitationCount().equals(other.getInvitationCount()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getCollectNum() == null ? other.getCollectNum() == null : this.getCollectNum().equals(other.getCollectNum()))
            && (this.getActivityNum() == null ? other.getActivityNum() == null : this.getActivityNum().equals(other.getActivityNum()))
            && (this.getVerifyCode() == null ? other.getVerifyCode() == null : this.getVerifyCode().equals(other.getVerifyCode()))
            && (this.getAccessToken() == null ? other.getAccessToken() == null : this.getAccessToken().equals(other.getAccessToken()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getVipStartTime() == null ? other.getVipStartTime() == null : this.getVipStartTime().equals(other.getVipStartTime()))
            && (this.getVipEndTime() == null ? other.getVipEndTime() == null : this.getVipEndTime().equals(other.getVipEndTime()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getIsVip() == null ? other.getIsVip() == null : this.getIsVip().equals(other.getIsVip()))
            && (this.getIsAdmin() == null ? other.getIsAdmin() == null : this.getIsAdmin().equals(other.getIsAdmin()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getRongCloudToken() == null ? other.getRongCloudToken() == null : this.getRongCloudToken().equals(other.getRongCloudToken()))
            && (this.getWechatOpenId() == null ? other.getWechatOpenId() == null : this.getWechatOpenId().equals(other.getWechatOpenId()))
            && (this.getWechatAccessToken() == null ? other.getWechatAccessToken() == null : this.getWechatAccessToken().equals(other.getWechatAccessToken()))
            && (this.getWechatRefreshToken() == null ? other.getWechatRefreshToken() == null : this.getWechatRefreshToken().equals(other.getWechatRefreshToken()))
            && (this.getWxUnionId() == null ? other.getWxUnionId() == null : this.getWxUnionId().equals(other.getWxUnionId()))
            && (this.getOuttradeno() == null ? other.getOuttradeno() == null : this.getOuttradeno().equals(other.getOuttradeno()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getWxSessionKey() == null ? other.getWxSessionKey() == null : this.getWxSessionKey().equals(other.getWxSessionKey()))
            && (this.getBindingId() == null ? other.getBindingId() == null : this.getBindingId().equals(other.getBindingId()))
            && (this.getLastInformTime() == null ? other.getLastInformTime() == null : this.getLastInformTime().equals(other.getLastInformTime()))
            && (this.getExtend() == null ? other.getExtend() == null : this.getExtend().equals(other.getExtend()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getValidation() == null) ? 0 : getValidation().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getFile() == null) ? 0 : getFile().hashCode());
        result = prime * result + ((getCompany() == null) ? 0 : getCompany().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getInvitationCount() == null) ? 0 : getInvitationCount().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getCollectNum() == null) ? 0 : getCollectNum().hashCode());
        result = prime * result + ((getActivityNum() == null) ? 0 : getActivityNum().hashCode());
        result = prime * result + ((getVerifyCode() == null) ? 0 : getVerifyCode().hashCode());
        result = prime * result + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getVipStartTime() == null) ? 0 : getVipStartTime().hashCode());
        result = prime * result + ((getVipEndTime() == null) ? 0 : getVipEndTime().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getIsVip() == null) ? 0 : getIsVip().hashCode());
        result = prime * result + ((getIsAdmin() == null) ? 0 : getIsAdmin().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getRongCloudToken() == null) ? 0 : getRongCloudToken().hashCode());
        result = prime * result + ((getWechatOpenId() == null) ? 0 : getWechatOpenId().hashCode());
        result = prime * result + ((getWechatAccessToken() == null) ? 0 : getWechatAccessToken().hashCode());
        result = prime * result + ((getWechatRefreshToken() == null) ? 0 : getWechatRefreshToken().hashCode());
        result = prime * result + ((getWxUnionId() == null) ? 0 : getWxUnionId().hashCode());
        result = prime * result + ((getOuttradeno() == null) ? 0 : getOuttradeno().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getWxSessionKey() == null) ? 0 : getWxSessionKey().hashCode());
        result = prime * result + ((getBindingId() == null) ? 0 : getBindingId().hashCode());
        result = prime * result + ((getLastInformTime() == null) ? 0 : getLastInformTime().hashCode());
        result = prime * result + ((getExtend() == null) ? 0 : getExtend().hashCode());
        return result;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private User obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new User();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.id
         *
         * @param id the value for user.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.mobile
         *
         * @param mobile the value for user.mobile
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder mobile(String mobile) {
            obj.setMobile(mobile);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.password
         *
         * @param password the value for user.password
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder password(String password) {
            obj.setPassword(password);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.validation
         *
         * @param validation the value for user.validation
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder validation(Integer validation) {
            obj.setValidation(validation);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.nick_name
         *
         * @param nickName the value for user.nick_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder nickName(String nickName) {
            obj.setNickName(nickName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.file
         *
         * @param file the value for user.file
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder file(String file) {
            obj.setFile(file);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.company
         *
         * @param company the value for user.company
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder company(String company) {
            obj.setCompany(company);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.location
         *
         * @param location the value for user.location
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder location(String location) {
            obj.setLocation(location);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.invitation_Count
         *
         * @param invitationCount the value for user.invitation_Count
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder invitationCount(Integer invitationCount) {
            obj.setInvitationCount(invitationCount);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.sex
         *
         * @param sex the value for user.sex
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder sex(String sex) {
            obj.setSex(sex);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.weixin
         *
         * @param weixin the value for user.weixin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder weixin(String weixin) {
            obj.setWeixin(weixin);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.collect_Num
         *
         * @param collectNum the value for user.collect_Num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder collectNum(Integer collectNum) {
            obj.setCollectNum(collectNum);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.activity_Num
         *
         * @param activityNum the value for user.activity_Num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder activityNum(String activityNum) {
            obj.setActivityNum(activityNum);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.verify_Code
         *
         * @param verifyCode the value for user.verify_Code
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder verifyCode(String verifyCode) {
            obj.setVerifyCode(verifyCode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.access_Token
         *
         * @param accessToken the value for user.access_Token
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder accessToken(String accessToken) {
            obj.setAccessToken(accessToken);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.expire_Time
         *
         * @param expireTime the value for user.expire_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder expireTime(Date expireTime) {
            obj.setExpireTime(expireTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.vip_Start_Time
         *
         * @param vipStartTime the value for user.vip_Start_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder vipStartTime(Date vipStartTime) {
            obj.setVipStartTime(vipStartTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.vip_End_Time
         *
         * @param vipEndTime the value for user.vip_End_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder vipEndTime(Date vipEndTime) {
            obj.setVipEndTime(vipEndTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.business_Id
         *
         * @param businessId the value for user.business_Id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder businessId(Integer businessId) {
            obj.setBusinessId(businessId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.is_Vip
         *
         * @param isVip the value for user.is_Vip
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isVip(Integer isVip) {
            obj.setIsVip(isVip);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.is_Admin
         *
         * @param isAdmin the value for user.is_Admin
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isAdmin(Integer isAdmin) {
            obj.setIsAdmin(isAdmin);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.create_Time
         *
         * @param createTime the value for user.create_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.update_Time
         *
         * @param updateTime the value for user.update_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.delete_Time
         *
         * @param deleteTime the value for user.delete_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder deleteTime(Date deleteTime) {
            obj.setDeleteTime(deleteTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.delete_flag
         *
         * @param deleteFlag the value for user.delete_flag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder deleteFlag(Integer deleteFlag) {
            obj.setDeleteFlag(deleteFlag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.rong_Cloud_Token
         *
         * @param rongCloudToken the value for user.rong_Cloud_Token
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder rongCloudToken(String rongCloudToken) {
            obj.setRongCloudToken(rongCloudToken);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.weChat_Open_Id
         *
         * @param wechatOpenId the value for user.weChat_Open_Id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder wechatOpenId(String wechatOpenId) {
            obj.setWechatOpenId(wechatOpenId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.weChat_Access_Token
         *
         * @param wechatAccessToken the value for user.weChat_Access_Token
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder wechatAccessToken(String wechatAccessToken) {
            obj.setWechatAccessToken(wechatAccessToken);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.weChat_Refresh_Token
         *
         * @param wechatRefreshToken the value for user.weChat_Refresh_Token
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder wechatRefreshToken(String wechatRefreshToken) {
            obj.setWechatRefreshToken(wechatRefreshToken);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.wx_Union_Id
         *
         * @param wxUnionId the value for user.wx_Union_Id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder wxUnionId(String wxUnionId) {
            obj.setWxUnionId(wxUnionId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.outTradeNo
         *
         * @param outtradeno the value for user.outTradeNo
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder outtradeno(String outtradeno) {
            obj.setOuttradeno(outtradeno);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.email
         *
         * @param email the value for user.email
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder email(String email) {
            obj.setEmail(email);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.wx_Session_Key
         *
         * @param wxSessionKey the value for user.wx_Session_Key
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder wxSessionKey(String wxSessionKey) {
            obj.setWxSessionKey(wxSessionKey);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.binding_Id
         *
         * @param bindingId the value for user.binding_Id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder bindingId(Long bindingId) {
            obj.setBindingId(bindingId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.last_Inform_Time
         *
         * @param lastInformTime the value for user.last_Inform_Time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder lastInformTime(Date lastInformTime) {
            obj.setLastInformTime(lastInformTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.extend
         *
         * @param extend the value for user.extend
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder extend(String extend) {
            obj.setExtend(extend);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public User build() {
            return this.obj;
        }
    }
}