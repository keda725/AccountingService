package com.togo.accounting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * service resource not found Exception.
 * create by crashLab.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends ServiceException {
    /**
     * define ResourceNotFoundException.
     * create by crashLab.
     */
    public ResourceNotFoundException(String message) {
        super(message);
        this.setStatusCode(HttpStatus.NOT_FOUND.value());
        this.setErrorCode(BizErrorCode.RESOURCE_NOT_FOUND);
        this.setErrorType(ErrorType.Client);
    }
}
