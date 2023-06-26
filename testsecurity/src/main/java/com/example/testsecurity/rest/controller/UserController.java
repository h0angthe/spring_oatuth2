package com.example.testsecurity.rest.controller;

import com.example.testsecurity.rest.model.InputCreateUser;
import com.example.testsecurity.service.UserService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/registration")
    public Object signin(@RequestBody InputCreateUser inputCreateUser, HttpServletResponse httpServletResponse){
        return userService.signIn(inputCreateUser,httpServletResponse);
    }
}
