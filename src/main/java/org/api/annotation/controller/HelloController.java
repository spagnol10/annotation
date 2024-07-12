package org.api.annotation.controller;

import org.api.annotation.log.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Log
    @GetMapping
    public ResponseEntity<Void> hello(){
        System.out.println("Middle of the process!");
        privateMethod();
        return ResponseEntity.ok().build();
    }

    @Log
    private void privateMethod(){
        System.out.println("Private method: Middle of the process!");
    }
}
