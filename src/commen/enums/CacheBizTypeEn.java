package common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum CacheBizTypeEn {
    USER_LOGIN_TOKEN("USER_LOGIN_TOKEN", "USER_LOGIN_TOKEN"),
    TAG_USED("TAG_USED", "TAG_USED")
    ;

    private String value;
    private String desc;
}
