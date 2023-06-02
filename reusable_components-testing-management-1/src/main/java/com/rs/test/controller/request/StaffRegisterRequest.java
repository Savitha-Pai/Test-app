package com.rs.test.controller.request;

import com.rs.test.dataaccess.rds.enums.GenderEnum;
import com.rs.test.dataaccess.rds.enums.StaffCategoryEnum;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Data
public class StaffRegisterRequest {

    private String employeeId;

    @NotBlank(message = "Name is required.")
    private String name;
    private GenderEnum gender;

    private Integer institutionId;

    private Integer staffType;

    @Past(message = "Please enter valid Date of Birth. Date of Birth cannot be future date.")
    private Date dob;

    @PastOrPresent(message = "Please enter valid Date of joining. Date of joining cannot be future date.")
    private Date doj;
    private Integer age;
    @Email(message = "Invalid Email Address")
    private String emailId;
    @Pattern(regexp = "^\\+[1-9]\\d{3,14}$", message = "Invalid mobile number")
    private String mobileNumber;
    private String designation;
    private String jobDescription;
    private StaffCategoryEnum category;
    private boolean isAnesthetist;
    private boolean isSurgeon;
    private Integer serviceCharge;
    private String registrationNumber;
    private List<Integer> specialization;
}