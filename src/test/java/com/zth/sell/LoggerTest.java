package com.zth.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.management.snmp.util.MibLogger;

/**
 * Author: 3zZ.
 * Date: 2019/10/12 12:02 上午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test1(){
        String name = "zth";
        String password = "12345";
        log.debug("debug...");
        log.info("info...");
        log.info("name:{},password:{}", name, password);
        log.error("error.....");
        log.warn("warn...");
    }
}
