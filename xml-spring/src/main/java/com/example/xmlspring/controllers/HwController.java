package com.example.xmlspring.controllers;


import com.example.xmlspring.modells.RequestScopeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HwController {

    @GetMapping("/")
    public String HW(RequestScopeBean requestScopeBean) {
        return new StringBuilder().append("First bean:")
                .append(requestScopeBean)
                .append("\n\n")
                .append("Second bean")
                .append(requestScopeBean).toString();
    }
}
