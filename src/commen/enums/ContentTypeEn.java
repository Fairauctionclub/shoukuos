package common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import exception.BizException;

@AllArgsConstructor
@Getter
public enum ContentTypeEn {
    HTML("HTML", "html"),
    MARKDOWN("MARKDOWN", "markdown"),
    ;

    private String value;
    private String desc;

    public static ContentTypeEn getEntity(String value) {
        for (ContentTypeEn contentType : values()) {
            if (contentType.getValue().equals(value)) {
                return contentType;
            }
        }
        throw new BizException(ErrorCodeEn.CONTENT_TYPE_NOT_EXIST);
    }
}
