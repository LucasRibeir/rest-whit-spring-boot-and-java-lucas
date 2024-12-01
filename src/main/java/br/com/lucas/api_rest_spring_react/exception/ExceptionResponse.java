package br.com.lucas.api_rest_spring_react.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date timeStamp;
    private String message;
    private String details;
}