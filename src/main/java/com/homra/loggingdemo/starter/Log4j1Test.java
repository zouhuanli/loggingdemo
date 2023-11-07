package com.homra.loggingdemo.starter;


import org.apache.log4j.Logger;


public class Log4j1Test {
    //注意这个Logger类是旧的log4j1的类
    private static final Logger LOGGER = Logger.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!" + Log4j1Test.class.getSimpleName());
    }
}
