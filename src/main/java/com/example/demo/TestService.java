package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    Logger logger = LoggerFactory.getLogger(TestService.class);

    public TestService() {
        logger.info("TestService info message");
        logger.warn("TestService warn message");
        logger.error("TestService error message");
    }
}
