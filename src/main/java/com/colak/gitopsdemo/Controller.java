package com.colak.gitopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.UnknownHostException;
import java.net.InetAddress;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index() throws UnknownHostException {
        String podName = InetAddress.getLocalHost().getHostName();
        return "dashboard";
    }
}
