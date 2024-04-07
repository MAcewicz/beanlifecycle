package com.kodilla.beanlifecycle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/bean")
public class BeanController {

    private AppConfig appConfig;

    public BeanController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @GetMapping
    public void getBean()  {
        appConfig.libraryManager();
    }
}
