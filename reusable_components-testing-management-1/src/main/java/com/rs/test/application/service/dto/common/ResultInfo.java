package com.rs.test.application.service.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultInfo extends com.rs.um.application.service.dto.common.ResultInfo implements Serializable {
    private String codeId;
    private String code;
    private String message;
    private String status;
}