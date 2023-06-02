package com.rs.test.constants;

import com.rs.test.application.service.dto.common.ResultInfo;

public class ResultInfoConstants {
    private ResultInfoConstants() {
    }

    public static final String STATUS_FAILED = "F";
    public static final String RESULT_MSG_NOT_FOUND = "Result message not found";
    //Error Code Format - XXYYYZZZ where,
    //    XX -> Service Code. For user-management, service code is 22
    //    YYY -> Feature code (service specific). For common service, feature code is 000
    //    ZZZ -> Sequence number should start from 001
    public static final ResultInfo SUCCESS = new ResultInfo("22000001", "SUCCESS", "Successful Request", "S");
    public static final ResultInfo SYSTEM_ERROR = new ResultInfo("22000002", "SYSTEM_ERROR", "Internal Server Error", "F");


    public static final ResultInfo BAD_REQUEST = new ResultInfo("22000003", "BAD_REQUEST", "Bad Request", "F");
    public static final ResultInfo MSG_PARSE_ERROR = new ResultInfo("22000004", "MSG_PARSE_ERROR", "Message Parsing Error", "F");
    public static final ResultInfo NOT_FOUND = new ResultInfo("22000005", "NOT_FOUND", "Requested resource not found", "F");

    public static final ResultInfo REQ_FIELD_VALIDATION_ERROR = new ResultInfo("22000006", "REQ_FIELD_VALIDATION_ERROR", "", "F");

    public static final ResultInfo BIRTH_DATE_ERROR = new ResultInfo("22001001", "BIRTH_DATE_ERROR", "Employee age cannot be less than 18 years.", "F");

    public static final ResultInfo DATE_OF_JOINING_ERROR = new ResultInfo("22001002", "DATE_OF_JOINING_ERROR", "Please enter valid Date of Joining. Date of Birth cannot be more than Date of Joining.", "F");
    public static final ResultInfo INVALID_USER_CODE = new ResultInfo("22001004", "INVALID_USER_CODE", "Invalid User Code", "F");
    public static final ResultInfo STAFF_NOT_FOUND = new ResultInfo("22001003", "STAFF_NOT_FOUND", "Requested staff not found.", "F");
    public static final ResultInfo STAFF_TYPE_NOT_FOUND = new ResultInfo("22003002", "STAFF_TYPE_NOT_FOUND", "Requested staff type not found", "F");
    public static final ResultInfo USER_CODE_EXIST = new ResultInfo("22003003", "USER_CODE_EXIST", "User code already exists", "F");

}