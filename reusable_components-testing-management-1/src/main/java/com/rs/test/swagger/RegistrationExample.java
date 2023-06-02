package com.rs.test.swagger;

public class RegistrationExample {
    public static final String STAFF_CREATE_REQ = """
            {
              "name": "lambodar Ganesh",
              "gender": "MALE",
              "institutionId": 1,
              "staffType": 1,
              "dob": "2000-01-18T13:49:27.621Z",
              "doj": "2023-01-11T13:49:27.621Z",
              "age": 23,
              "emailId": "test@gmail.com",
              "mobileNumber": "+917829925566",
              "designation": "registrar",
              "jobDescription": "This is the job description",
              "category": "EMPLOYEE",
              "serviceCharge": 345,
              "registrationNumber": "REWT7873763",
              "grantAccessToHms": true,
              "password": "67w6637",
              "username": "disha",
              "surgeon": true,
              "anesthetist": true,
              "specialization": [
                1,
                2
              ]
            }""";

    private RegistrationExample() {
    }
}
