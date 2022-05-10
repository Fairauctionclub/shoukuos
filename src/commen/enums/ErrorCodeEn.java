package pub.developers.forum.common.enums;


public enum ErrorCodeEn {
    /**
     *
     */
    SUCCESS(0, "成功"),
    SYSTEM_ERROR(9999, "系统异常"),
    CONFIG_DOMAIN_NOT_EMPTY(9998, "领域配置不可为空"),
    DATABASE_UUID_ERROR(9997, "数据库 uuid 插件异常"),
    DATABASE_NOW_ERROR(9996, "数据库 now date 插件异常"),
    PARAM_CHECK_ERROR(9995, "请求参数不能为空：{0}"),
    CHECK_ERROR_TOAST(9994, "{0}"),
    NO_PERMISSION(9993, "无操作权限"),
    REPEAT_OPERATION(9992, "重复操作"),
    OPERATION_DATA_NOT_EXIST(9991, "操作数据不存在"),
    GITHUB_OAUTH_ERROR(9990, "github 授权异常"),

    // 0500~0750 common error
    COMMON_CACHE_KEY_EMPTY(8999, "缓存 key 不能为空"),

    COMMON_TOKEN_NO_PERMISSION(8996, "无操作权限"),
//    COMMON_START_TIME_AFTER_END(505, "开始时间不能大于结束时间"),

    DOMAIN_NOT_EXIST(7999, "不存在的领域类型"),
    DOMAIN_TYPE_NOT_EXIST(7998, "领域类型不存在"),

    USER_NOT_LOGIN(8998, "用户未登陆"),
    USER_NOT_EXIST(7996, "用户不存在"),
    USER_REGISTER_EMAIL_IS_EXIST(7992, "注册邮箱已存在"),
    USER_LOGIN_PWD_ERROR(7992, "登录密码错误"),
    USER_OLD_PASSWORD_ERROR(7991, "旧密码错误"),
    USER_ROLE_NOT_EXIST(7990, "用户角色不存在"),
    USER_SEX_NOT_EXIST(7989, "用户性别不存在"),
    USER_TOKEN_INVALID(7988, "token 无效"),
    USER_STATE_IS_DISABLE(7987, "用户已被禁用"),
    ;


    private Integer code;
    private String message;

    ErrorCodeEn(Integer code, String message) {
        this.code = 8000_0000 + code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
