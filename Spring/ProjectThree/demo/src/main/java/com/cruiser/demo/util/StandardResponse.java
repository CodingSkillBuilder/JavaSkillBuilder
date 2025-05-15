package com.cruiser.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class StandardResponse {

    private int Code;
    private String message;
    private Object data;

    public StandardResponse(int code, String message, Object data) {
        Code = code;
        this.message = message;
        this.data = data;
    }
}
