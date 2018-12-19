package com.loveqrc.spring;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LoggerTest {
    private Logger mLogger = Logger.getLogger(LoggerTest.class);
    @Test
    public void testLogger(){
        System.out.println("hello logger");
        mLogger.info("hello logger");

    }
}
