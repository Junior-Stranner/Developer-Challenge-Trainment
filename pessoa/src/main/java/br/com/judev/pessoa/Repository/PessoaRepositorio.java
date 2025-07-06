package br.com.judev.pessoa.Repository;

import br.com.judev.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

    @Query("SELECT SUM(p.idade) FROM PessoaModelo p")
    Long calcularSomaIdades();
}
