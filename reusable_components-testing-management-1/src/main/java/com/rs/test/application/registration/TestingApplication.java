package com.rs.test.application.registration;

import static com.rs.test.constants.ResultInfoConstants.SUCCESS;

import com.rs.test.application.service.registration.TestingService;
import com.rs.test.controller.request.StaffRegisterRequest;
import com.rs.test.util.ResultUtil;
import javax.transaction.Transactional;

import com.rs.um.util.RandomNumberGenerationUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestingApplication {
    private final TestingService registrationService;

    private final RandomNumberGenerationUtils randomNoGenerationUtils;


}
