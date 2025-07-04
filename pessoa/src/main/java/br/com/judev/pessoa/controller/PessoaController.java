package br.com.judev.pessoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping("/message/{nome}")
    public String greetings(@PathVariable String nome){
        return "Hello World " +nome;
    }
}
