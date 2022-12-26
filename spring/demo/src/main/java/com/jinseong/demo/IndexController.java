package com.jinseong.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {
    @GetMapping("/index")
    public ResponseEntity<?> index() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");

        return new ResponseEntity<>(HttpStatus.OK);
        // return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
