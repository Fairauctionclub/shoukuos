package common.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArticleTypeScopeEn {
  
    OFFICIAL("OFFICIAL", "官方"),
    USER("USER", "用户"),
    ;
    private String value;
    private String desc;

    public static AuditStateEn getEntity(String value) {
        for (AuditStateEn entity : values()) {
            if (entity.getValue().equalsIgnoreCase(value)) {
                return entity;
            }
        }

        return null;
    }
}
