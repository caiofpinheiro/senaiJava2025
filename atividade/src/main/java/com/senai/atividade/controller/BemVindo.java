package com.senai.atividade.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class BemVindo {

    @RequestMapping("/")
    public String index() {
        return "Bem-vindo ao sistema de atividades!";
    }
}
