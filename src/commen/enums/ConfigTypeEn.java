package common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ConfigTypeEn {

 
    HOME_CAROUSEL("HOME_CAROUSEL", "首页轮播图"),
    SIDEBAR_CAROUSEL("SIDEBAR_CAROUSEL", "侧边栏轮播图"),
    ;

    private String value;
    private String desc;

    public static ConfigTypeEn getEntity(String value) {
        
        return null;
    }

}
