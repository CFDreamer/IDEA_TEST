package com.chanfrer.procuctcilent.cilent;

import com.chanfrer.produceservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCilent {
    @Autowired
    private UserService service;
    
    @GetMapping("/getUser")
    public String getUser(){
        return service.getUser();
    }
}
