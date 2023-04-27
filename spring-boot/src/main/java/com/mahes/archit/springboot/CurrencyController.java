package com.mahes.archit.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration cv;

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration currency() {
        return cv;
    }
}
