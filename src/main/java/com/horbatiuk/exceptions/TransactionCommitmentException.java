package com.horbatiuk.exceptions;

public class TransactionCommitmentException extends ServiceException {
    /**
     * Basic serialVersionUID variable.
     */
    private static final long serialVersionUID = 2295691435330744338L;

    /**
     * Default constructor.
     */
    public TransactionCommitmentException() {
    }

    /**
     * Public constructor.
     *
     * @param message exception message
     */
    public TransactionCommitmentException(final String message) {
        super(message);
    }

    /**
     * Public constructor.
     *
     * @param cause exception cause
     */
    public TransactionCommitmentException(final Throwable cause) {
        super(cause);
    }

    /**
     * Public constructor.
     *
     * @param message exception message
     * @param cause   exception cause
     */
    public TransactionCommitmentException(final String message, final Throwable cause) {
        super(message, cause);
    }
}