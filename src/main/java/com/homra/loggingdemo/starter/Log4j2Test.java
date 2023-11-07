package com.homra.loggingdemo.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }
}
