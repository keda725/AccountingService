package com.togo.accounting.exception;

import lombok.Builder;
import lombok.Data;


/**
 * create by crashLab.
 */
@Data
@Builder
public class ErrorResponse {
    private BizErrorCode code;
    private ServiceException.ErrorType errorType;
    private String message;
    private int statusCode;
}
