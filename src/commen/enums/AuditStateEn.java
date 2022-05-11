package common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuditStateEn {
    /**
     *
     */
    WAIT("WAIT", "WAIT"),
    PASS("PASS", "PASS"),
    REJECT("REJECT", "REJECT"),
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
