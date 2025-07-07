package br.com.judev.pessoa.Repository;

import br.com.judev.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

    Iterable<Pessoa> findByCidade(String cidade);

    Iterable<Pessoa> findByCidadeOrCidade(String cidade1, String cidade2);

    Iterable<Pessoa> findByIdadeGreaterThanEqual(Integer idade);

    Iterable<Pessoa> findByIdadeBetween(Integer idade1, Integer idade2);

    Iterable<Pessoa> findByNomeLikeIgnoreCase(String nome);

    Iterable<Pessoa> findAllByOrderByNomeAsc();

    Long countByCidade(String cidade);

    @Query("SELECT SUM(p.idade) FROM PessoaModelo p")
    Long calcularSomaIdades();
}
