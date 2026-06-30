package by.homework.lessons.Task16;

public class NotEnoughMoneyException extends RuntimeException {

    private String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(Throwable cause, String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public NotEnoughMoneyException() {

    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
