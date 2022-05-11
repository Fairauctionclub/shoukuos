package common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ConfigTypeEn {

 
    HOME_CAROUSEL("HOME_CAROUSEL", "HOME_CAROUSEL"),
    SIDEBAR_CAROUSEL("SIDEBAR_CAROUSEL", "SIDEBAR_CAROUSEL"),
    ;

    private String value;
    private String desc;

    public static ConfigTypeEn getEntity(String value) {
        for (ConfigTypeEn contentType : values()) {
            if (contentType.getValue().equals(value)) {
                return contentType;
            }
        }
        return null;
    }

}
