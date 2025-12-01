package com.java.Controller;

import com.java.dto.UserCreateRequest;
import com.java.service.UserMasterService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserMasterService service;

    public AuthController(UserMasterService service) {
        this.service = service;
    }

    // LOGIN API
    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String username,
                                     @RequestParam String password) {

        // Service already returns Map<String,Object>
        return service.login(username, password);
    }

    // CREATE USER API
    @PostMapping("/createUser")
    public Map<String, Object> createUser(@RequestBody UserCreateRequest request) {

        // Service already returns Map<String,Object>
        return service.createUser(request);
    }
}
