package org.springboot.riwi.chronoturner.backend.dtos.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@SuperBuilder
public class ErrorSimple {

    private Integer code;
    private String status;

    private String message;
    private List<String> fields;

}
