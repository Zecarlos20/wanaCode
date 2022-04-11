package com.wanacode.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("api/categorias")
public class CategoryController {

    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    private String getTestProp() {
        return this.testProp;
    }
}
