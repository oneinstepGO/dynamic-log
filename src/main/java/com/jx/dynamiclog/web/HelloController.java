package com.jx.dynamiclog.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.spi.ThreadContextMapFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoyao91
 * @date 2022-01-26
 * @since 1.0
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code","200");
        map.put("message","hello");

        ThreadContextMapFactory.createThreadContextMap().put("User1", "111");

        log.info("hi >>>>>>>>>>>>>");
        return map;
    }

}
