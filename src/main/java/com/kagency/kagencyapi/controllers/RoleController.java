package com.kagency.kagencyapi.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @RequestMapping(method = RequestMethod.GET)
    public String allUser() {
        return "Roles";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createRole(@RequestBody Map<String, Object> map) {
        String roleName = (String) map.get("role_name");
        String roleDescription = (String) map.get("role_description");
        return "insert";
    }
}
