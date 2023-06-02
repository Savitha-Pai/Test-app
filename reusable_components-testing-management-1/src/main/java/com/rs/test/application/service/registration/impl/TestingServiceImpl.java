package com.rs.test.application.service.registration.impl;


import com.rs.test.application.repository.PersistRegistrationRepo;
import com.rs.test.application.service.registration.TestingService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestingServiceImpl implements TestingService {

    private final PersistRegistrationRepo persistRegistrationRepo;

    @Value("${aes.encryption.key}")
    public String encryptionKey;


    @Value("${app.kafka.consumer.rs_audit_trail_topic}")
    public transient String producerTopic;



}