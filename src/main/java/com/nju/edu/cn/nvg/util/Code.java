package com.nju.edu.cn.nvg.util;

public class Code {

    /**
     * 失败提示信息状态吗
     */
    public enum ERROR {

        Exception_000("系统异常"),
        Exception_001("存在必填参数缺失"),
        Exception_002("部分参数格式错误"),
        Exception_003("请求的参数类型不符合要求"),
        Exception_004("身份无效，请先登录"),
        Exception_005("请求数据的body缺失/类型不符合"),
        Exception_006("下载发生错误"),
        Exception_007("导入的文件存在问题，导入失败"),
        Exception_008("该账号被管理员踢下线，请重新登录"),

        Exception_010("操作失败"),


        ERROR_COMMON_PAGE_PARAMS("分页参数出错"),
        ERROR_COMMON_CREATE("新建失败"),
        ERROR_COMMON_UPDATE("更新失败"),
        ERROR_COMMON_DELETE("删除失败"),
        ERROR_COMMON_ID_NOT_EXIST("ID不存在/ID对应的数据不存在"),
        ERROR_COMMON_NAME_DATA__NOT_EXIST("name对应的数据不存在"),
        ERROR_COMMON_USERNAME_NOT_EXIST("用户名不存在"),
        ERROR_COMMON_LACK_REQUIRED_PARAM("存在必填参数为空"),
        ERROR_COMMON_FORMAT("部分参数格式错误"),



        ERROR_LOGIN_COUNT("登录失败超过5次"),
        ERROR_LOGIN_FAIL("用户名或密码错误"),
        ERROR_LOGIN_TOPLIMIT("该用户登录数已达上限"),
        ERROR_LOGIN_IP("登录IP有误"),


        ERROR_MANAGER_DENY("禁止删除超级管理员"),

        ERROR_APP_ICON_UPLOAD("图标上传失败"),
        ERROR_APP_ICON_FORMAT("图标格式错误"),


        ERROR_COMMON_000("分页参数出错"),
        ERROR_COMMON_001("新建失败"),
        ERROR_COMMON_002("更新失败"),
        ERROR_COMMON_003("删除失败"),

        ERROR_LOGIN_100("登录失败超过5次"),
        ERROR_LOGIN_101("用户名或密码错误");








        private String info;

        private ERROR(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        @Override
        public String toString() {
            return "ERROR{" +
                    "info='" + info + '\'' +
                    "} " + super.toString();
        }
    }

    private ERROR error;
    private String info;

    public Code(ERROR error) {
        this.error = error;
        this.info = error.getInfo();
    }

    public ERROR getError() {
        return error;
    }

    public void setErrorAndInfo(ERROR error) {
        this.error = error;
        this.info = error.getInfo();
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Code{" +
                "error=" + error +
                ", info='" + info + '\'' +
                '}';
    }
}
