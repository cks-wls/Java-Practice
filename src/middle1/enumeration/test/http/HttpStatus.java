package middle1.enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public static HttpStatus findByCode(int httpCodeInput) {
//        if(httpCodeInput >= 200 && httpCodeInput <= 299){
//            return HttpStatus.OK;
//        }else if(httpCodeInput == 400){
//            return HttpStatus.BAD_REQUEST;
//        }else if(httpCodeInput == 404){
//            return HttpStatus.NOT_FOUND;
//        }else if(httpCodeInput == 500){
//            return HttpStatus.INTERNAL_SERVER_ERROR;
//        }else{
//            return null;
//        }
        for (HttpStatus value : values()) {
            if (value.getCode() == httpCodeInput) {
                return value;
            }
        }
        return null;
    }
    public boolean isSuccess(){
        return (code >= 200 && code <= 299)? true : false;
    }
}
