package net.feelan.core.service.exception;

public class ServiceException extends RuntimeException {

    /** 
    *serialVersionUID 
    */
    private static final long serialVersionUID = 1L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    
}
