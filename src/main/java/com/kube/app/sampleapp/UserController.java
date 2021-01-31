package com.kube.app.sampleapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/properties")
    public String index() {
        StringBuffer sb = new StringBuffer();
        
        String user = System.getProperty("user");
        String psw = System.getProperty("psw");

        sb.append("user - " + user);
        sb.append("password -" + psw);

        return sb.toString();
    }
}
