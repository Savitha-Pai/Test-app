package com.rs.test.controller.response;

import com.rs.test.dataaccess.rds.enums.GenderEnum;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StaffRegisterResponse {

    private Integer id;
    private String employeeId;
    private String name;
    private GenderEnum gender;
    private Integer institutionId;

    private Integer staffType;

    private Date dob;

    private Date doj;
    private Integer age;
    private String emailId;
    private String mobileNumber;
    private String designation;
    private String jobDescription;
    private String staffCategory;
    private String otherCategory;
    private boolean isAnesthetist;
    private boolean isSurgeon;
    private Integer serviceCharge;
    private String registrationNumber;
    private List<Integer> specialization;
}