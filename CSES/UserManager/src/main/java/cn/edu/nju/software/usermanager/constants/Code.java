package cn.edu.nju.software.usermanager.constants;

public class Code {

    //失败提示信息状态码
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
        Exception_009("部分信息导入失败"),

        ERROR_COMMON_PAGE_PARAMS("分页参数出错"),
        ERROR_COMMON_CREATE("新建失败"),
        ERROR_COMMON_UPDATE("更新失败"),
        ERROR_COMMON_DELETE("删除失败");


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
