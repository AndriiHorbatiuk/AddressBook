package com.horbatiuk.exceptions;

public class ServiceException extends Exception {

    /**
     * Basic serialVersionUID variable.
     */
    private static final long serialVersionUID = 2318630781460315818L;

    /**
     * Default constructor.
     */
    public ServiceException() {
    }

    /**
     * Public constructor.
     *
     * @param message exception message
     */
    public ServiceException(final String message) {
        super(message);
    }

    /**
     * Public constructor.
     *
     * @param cause exception cause
     */
    public ServiceException(final Throwable cause) {
        super(cause);
    }

    /**
     * Public constructor.
     *
     * @param message exception message
     * @param cause   exception cause
     */
    public ServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

}