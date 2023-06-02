package com.rs.test.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rs.test.application.service.dto.common.GenericServerResponse;
import com.rs.test.application.service.dto.common.ResultInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.rs.test.constants.ResultInfoConstants.MSG_PARSE_ERROR;

public class ResultUtil {
    public static ResponseEntity<Object> generateResponse(ResultInfo resultInfo, Object data) {
        return new ResponseEntity<>(GenericServerResponse.builder().resultInfo(resultInfo).data(data).build()
                , HttpStatus.OK);
    }

    public static String buildResult(ResultInfo resultInfo, Object data) {
        try {
            return ObjectMapperUtil.mapObjectToJson(GenericServerResponse.builder().resultInfo(resultInfo)
                    .data(data).build());
        } catch (JsonProcessingException exception) {
            return ResultUtil.buildResult(MSG_PARSE_ERROR, null);
        }
    }
    private ResultUtil() {
    }
}
