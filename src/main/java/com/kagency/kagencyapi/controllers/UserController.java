package com.kagency.kagencyapi.controllers;

import com.google.gson.Gson;
import com.kagency.kagencyapi.entities.User;
import com.kagency.kagencyapi.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> allUser() {
        List<User> users = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("data", new Gson().toJson(users));
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> registerUser(@RequestBody Map<String, Object> map) {
        String firstName = (String) map.get("first_name");
        String lastName = (String) map.get("last_name");
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        Map<String, String> userMap = new HashMap<>();
        map.put("message", "registered successfully!");
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}
