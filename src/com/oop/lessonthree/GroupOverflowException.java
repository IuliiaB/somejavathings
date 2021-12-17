package com.oop.lessonthree;

public class GroupOverflowException extends Exception {
    public GroupOverflowException() {
    }

    public GroupOverflowException(String message) {
        super(message);
    }

    public GroupOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupOverflowException(Throwable cause) {
        super(cause);
    }

    public GroupOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
