package com.Ankit.Kubernetes;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {


    @GetMapping("/show")
    public String displayMessage(){

        return  "Kubernetes deployment example";
    }
}
