package com.swey.test.controller;

import com.swey.test.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    AIService aiService;

    @GetMapping("/user")
    public ResponseEntity<String> postUser(){
        System.out.println();
        ResponseEntity<String> responseEntity = new ResponseEntity<>(aiService.getResponse(), HttpStatus.OK);
        return responseEntity;
    }

}
