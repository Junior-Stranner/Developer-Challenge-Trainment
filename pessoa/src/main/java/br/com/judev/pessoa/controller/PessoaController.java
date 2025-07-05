package br.com.judev.pessoa.controller;

import br.com.judev.pessoa.Repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    @GetMapping("/message/{nome}")
    public String greetings(@PathVariable String nome){
        return "Hello World " +nome;
    }
}
