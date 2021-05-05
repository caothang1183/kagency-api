package com.kagency.kagencyapi.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String allUser() {
        return "Users";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@RequestBody Map<String, Object> map) {
        String firstName = (String) map.get("first_name");
        String lastName = (String) map.get("last_name");
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        return firstName;
    }
}
