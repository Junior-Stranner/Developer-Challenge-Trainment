package br.com.judev.pessoa.service;

import br.com.judev.pessoa.Repository.PessoaRepositorio;
import br.com.judev.pessoa.model.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {


    // Atributo da classe
    private final PessoaRepositorio pessoaRepositorio;

    public PessoaService(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

    // Método responsável pela listagem de pessoas
    public ResponseEntity<Iterable<Pessoa>> listarPessoas(){
        return new ResponseEntity<>(this.pessoaRepositorio.findAll(), HttpStatus.OK);
    }

    // Método responsável pelo cadastro de pessoas
    public ResponseEntity<Pessoa> cadastrarPessoa(Pessoa pm){
        return new ResponseEntity<>(this.pessoaRepositorio.save(pm), HttpStatus.CREATED);
    }

    // Método responsável pela alteração total dos dados
    public ResponseEntity<Pessoa> alterarPessoaTotal(Long codigo, Pessoa pessoa){
        // Obter o registro contido na tabela
        Optional<Pessoa> obj = this.pessoaRepositorio.findById(codigo);

        // Condicional
        if(obj.isPresent()){
            pessoa.setCodigo(codigo);
            return new ResponseEntity<>(this.pessoaRepositorio.save(pessoa), HttpStatus.OK);
        }

        // Caso o código não exista
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Método responsável pela alteração parcial dos dados
    public ResponseEntity<Pessoa> alterarPessoaParcial(Long codigo, Pessoa pessoa){
        // Obter o registro contido na tabela
        Optional<Pessoa> obj = this.pessoaRepositorio.findById(codigo);

        // Condicional
        if(obj.isPresent()){
            // Converter Optional para Pessoa
            Pessoa pm2 = obj.get();

            // Verificação
            if(pessoa.getNome() != null){
                pm2.setNome(pessoa.getNome());
            }

            if(pessoa.getCidade() != null){
                pm2.setCidade(pessoa.getCidade());
            }

            // Retorno
            return new ResponseEntity<>(this.pessoaRepositorio.save(pm2), HttpStatus.OK);
        }

        // Caso o código não exista
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Método responsável pela remoção de pessoas
    public ResponseEntity<Void> removerPessoa(Long codigo){
        // Verificar a existência do código
        boolean existeCodigo = this.pessoaRepositorio.existsById(codigo);

        // Condicional
        if(existeCodigo){
            this.pessoaRepositorio.deleteById(codigo);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        // Caso o código não exista
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Método para testar as funcionalidades implementadas no repositório
    public Long teste(String cidade){
        return this.pessoaRepositorio.calcularSomaIdades();
    }
}
