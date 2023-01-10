package com.gigiozzz.testloadpath.web;

import com.gigiozzz.testloadpath.ApiResponseGeneration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WebController {

    @Autowired
    private ApiResponseGeneration api;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test() {
        return new ResponseEntity<>(api.genResponse("gigiozzz"), HttpStatus.OK);
    }
}
