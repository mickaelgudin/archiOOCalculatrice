package settings;

public enum ExceptionEnum {
    DIVISION_BY_ZERO(1, "Division by zero not authorized"),
    UNKNOWN_OPERATION(2, "Operation not implemented yet"),
	TYPE_ERROR(3, "Error on type, check if you have the good format with number+symbol+number ");
    
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
