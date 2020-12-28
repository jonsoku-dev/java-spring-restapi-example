package com.tamastudy.myrestfulservices.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 예외 처리를 위한 클래스
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    public Date timestamp;
    public String message;
    public String details;
}
