package com.swey.test.controller;

import com.swey.test.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    AIService aiService;

    @PostMapping("/user")
    public ResponseEntity<String> postUser(@RequestParam("prompt") String prompt){
        ResponseEntity<String> responseEntity = new ResponseEntity<>(aiService.getResponse(prompt), HttpStatus.OK);
        return responseEntity;
    }

}
