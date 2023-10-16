package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author USER
 * @version 1.0
 * @created 16/10/2023 - 23:49
 * @project demo
 */
@RestController
public class ApiController
{
    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("works successfully...");
    }

}
