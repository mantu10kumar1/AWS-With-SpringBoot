package com.codesnippet.parameterstore_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${app.name}")
    private String appName;

    @GetMapping("/config")
    public String getConfig() {
        return "App Name from Config Server: " + appName;
    }
}
