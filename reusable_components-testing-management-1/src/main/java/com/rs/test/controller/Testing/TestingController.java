package com.rs.test.controller.Testing;

import com.rs.test.application.registration.TestingApplication;
import com.rs.test.constants.APIEndpoints;
import com.rs.test.controller.request.StaffRegisterRequest;
import com.rs.um.application.registration.RegistrationApplication;
import com.rs.um.controller.request.UserRegisterRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rs.test.constants.OpenAPITags.TAG_REGISTRATION;
import static com.rs.test.swagger.RegistrationExample.STAFF_CREATE_REQ;

@RestController
@RequestMapping(APIEndpoints.API_V1_REGISTRATION)
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestingController {
    private final RegistrationApplication registrationApp;

    @Operation(summary = "API to register staff", tags = {TAG_REGISTRATION},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(content = @Content(examples = {
                    @ExampleObject(value = STAFF_CREATE_REQ)
            })))
    @PostMapping(value = APIEndpoints.REGISTER, produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> create(
            @Validated @RequestBody UserRegisterRequest request) {
        log.info("Register Staff with name:{}", request.getEmail ());
        return registrationApp.register(request);
    }
}