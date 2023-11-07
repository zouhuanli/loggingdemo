package com.homra.loggingdemo.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test {
    //log4j2+slf4j的Logger类
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!" + Log4j2Test.class.getSimpleName());
    }
}
