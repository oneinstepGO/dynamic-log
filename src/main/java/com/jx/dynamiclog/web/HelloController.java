package com.jx.dynamiclog.web;

import lombok.extern.slf4j.Slf4j;
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

    /**
     * curl --location --request GET 'localhost:9090/hello' \
     * --header 'X-Debug: true'
     * @return
     */
    @GetMapping("hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code","200");
        map.put("message","hello");
        log.debug("hi debug>>>>>>>>>>>>>");
        log.info("hi info>>>>>>>>>>>>>");
        log.error("hi error>>>>>>>>>>>>>");
        return map;
    }

}
