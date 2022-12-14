package com.emrezorlu.app.demo.airwayflightplan.common.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    GENERIC(1000), //
    INVALID_CURRENCY_SYMBOL(1001), //
    INVALID_ARGUMENTS(1003), //
    INVALID_DATE_TIME_FORMAT(1005), //
    DATE_PARSE_ERROR(1006), //
    NO_TRANSACTIONS_FOR_PERIOD(1201), //
    NO_TRANSACTION_BY_ID(1202), //
    FEIGN_CLIENT_ERROR(1101), //
    INTERNAL_ERROR(2000);

    private final Integer code;

    ErrorCode(Integer code) {
        this.code = code;
    }

    public static HttpStatus getHttpStatus(ErrorCode errorCode) {
        if (errorCode.code > 1000 && errorCode.code < 1100) {
            return HttpStatus.BAD_REQUEST;
        } else if (errorCode.code >= 2000 && errorCode.code < 3000) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else if (errorCode.code >= 1100 && errorCode.code < 1200) {
            return HttpStatus.SEE_OTHER;
        } else if (errorCode.code >= 1200 && errorCode.code < 2000) {
            return HttpStatus.NOT_FOUND;
        } else {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
