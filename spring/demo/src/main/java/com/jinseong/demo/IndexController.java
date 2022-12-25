package com.jinseong.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");

        return "index ok";
    }
}
