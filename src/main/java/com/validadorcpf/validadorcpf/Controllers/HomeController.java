package com.validadorcpf.validadorcpf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/valida-cpf")
    public String validaCpf(){
        return "cpfValidador.html";
    }
}
