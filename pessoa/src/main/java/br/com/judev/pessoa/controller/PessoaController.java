package br.com.judev.pessoa.controller;

import br.com.judev.pessoa.Repository.PessoaRepositorio;
import br.com.judev.pessoa.model.Pessoa;
import br.com.judev.pessoa.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/message/{nome}")
    public String greetings(@PathVariable String nome){
        return "Hello World " +nome;
    }
    // Rota responsável pela listagem de pessoas
    @GetMapping("/")
    public ResponseEntity<Iterable<Pessoa>> listarPessoas(){
        return this.pessoaService.listarPessoas();
    }

    // Rota responsável pelo cadastro de pessoas
    @PostMapping("/")
    public ResponseEntity<Pessoa> cadastrarPessoa(@Valid @RequestBody Pessoa pessoa){
        return this.pessoaService.cadastrarPessoa(pessoa);
    }

    // Rota responsável pela alteração total dos dados
    @PutMapping("/{codigo}")
    public ResponseEntity<Pessoa> alterarPessoaTotal(@PathVariable Long codigo, @Valid @RequestBody Pessoa pessoa){
        return this.pessoaService.alterarPessoaTotal(codigo, pessoa);
    }

    // Rota responsável pela alteração parcial dos dados
    @PatchMapping("/{codigo}")
    public ResponseEntity<Pessoa> alterarPessoaParcial(@PathVariable Long codigo, @RequestBody Pessoa pessoa){
        return this.pessoaService.alterarPessoaParcial(codigo, pessoa);
    }

    //Rota responsável pela remoção de pessoas
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> removerPessoa(@PathVariable Long codigo){
        return this.pessoaService.removerPessoa(codigo);
    }

    // Rota responsável pelos testes
    @GetMapping("/teste")
    public Long teste(){
        return this.pessoaService.teste("São Paulo");
    }

}
