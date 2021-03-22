package com.validadorcpf.validadorcpf.Controllers;

import com.validadorcpf.validadorcpf.Models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/valida-cpf")
    public String validaCpf(Cliente cliente, Model model){
        boolean verdade = cliente.validarCPF();
        model.addAttribute("verdade", verdade);
        return "cpfValidado.html";
    }
}
