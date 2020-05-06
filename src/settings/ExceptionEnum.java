package settings;

public enum ExceptionEnum {
    DIVISION_BY_ZERO(1, "division by zero not authorized"),
    UNKNOWN_OPERATION(2, "operation not implemented yet");
    
    private final int code;
    private final String defaultMessage;
    
    
    ExceptionEnum(int code, String defaultMessage) { 
            this.code = code;
            this.defaultMessage = defaultMessage;
    }
    public int getCode() {
            return code;
    }
    public String getDefaultMessage() {
            return defaultMessage;
    }
    
    public static String getNameFromCode(int code) {
    for(ExceptionEnum e : ExceptionEnum.values()){
        if(code == e.code) return e.name();
    }
    return null;
    }
}
