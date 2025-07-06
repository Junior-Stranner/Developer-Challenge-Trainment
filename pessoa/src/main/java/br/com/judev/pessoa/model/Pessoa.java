package br.com.judev.pessoa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pessoas")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Nome inválido!")
    @Size(min = 3, max = 30, message = "O nome deve ter entre 3 e 30 caracteres.")
    private String nome;

    @NotNull(message = "Idade inválida!")
    @Min(value = 0, message = "A idade mínima permitida é 0.")
    @Max(value = 120, message = "A idade máxima permitida é 120.")
    private int idade;

    @NotBlank(message = "Cidade inválida!")
    @Size(min = 3, max = 30, message = "O nome da cidade deve ter entre 3 e 30 caracteres.")
    private String cidade;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
