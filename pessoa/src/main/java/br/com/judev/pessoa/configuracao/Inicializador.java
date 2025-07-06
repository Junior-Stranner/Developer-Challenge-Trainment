package br.com.judev.pessoa.configuracao;

// Importações
import br.com.judev.pessoa.Repository.PessoaRepositorio;
import br.com.judev.pessoa.model.Pessoa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Classe como um componente gerenciado pelo Spring, permitindo a injeção de dependência e execução na inicialização
@Component
public class Inicializador implements CommandLineRunner {

    // Atributo da classe
    @SuppressWarnings("unused")
    private final PessoaRepositorio pessoaRepositorio;

    // Construtor que injeta a dependência do PessoaRepositorio, permitindo o acesso ao banco de dados
    public Inicializador(PessoaRepositorio pessoaRepositorio) {
        this.pessoaRepositorio = pessoaRepositorio;
    }

    // Método que é executado logo após a inicialização da aplicação
    @Override
    public void run(String... args) throws Exception {

        // Criar objetos que serão utilizados para armazenar na tabela de pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(30);
        pessoa1.setCidade("São Paulo");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(25);
        pessoa2.setCidade("Rio de Janeiro");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Carlos");
        pessoa3.setIdade(40);
        pessoa3.setCidade("Belo Horizonte");

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Ana");
        pessoa4.setIdade(28);
        pessoa4.setCidade("São Paulo");

        Pessoa pessoa5 = new Pessoa();
        pessoa5.setNome("Luciano");
        pessoa5.setIdade(35);
        pessoa5.setCidade("Rio de Janeiro");

        Pessoa pessoa6 = new Pessoa();
        pessoa6.setNome("Suellen");
        pessoa6.setIdade(22);
        pessoa6.setCidade("Curitiba");

        Pessoa pessoa7 = new Pessoa();
        pessoa7.setNome("Felipe");
        pessoa7.setIdade(50);
        pessoa7.setCidade("Salvador");

        Pessoa pessoa8 = new Pessoa();
        pessoa8.setNome("Luana");
        pessoa8.setIdade(30);
        pessoa8.setCidade("Porto Alegre");

        Pessoa pessoa9 = new Pessoa();
        pessoa9.setNome("Ricardo");
        pessoa9.setIdade(40);
        pessoa9.setCidade("Florianópolis");

        Pessoa pessoa10 = new Pessoa();
        pessoa10.setNome("Sofia");
        pessoa10.setIdade(27);
        pessoa10.setCidade("Fortaleza");

        Pessoa pessoa11 = new Pessoa();
        pessoa11.setNome("Gustavo");
        pessoa11.setIdade(33);
        pessoa11.setCidade("Recife");

        Pessoa pessoa12 = new Pessoa();
        pessoa12.setNome("Fernanda");
        pessoa12.setIdade(45);
        pessoa12.setCidade("São Paulo");

        Pessoa pessoa13 = new Pessoa();
        pessoa13.setNome("Roberta");
        pessoa13.setIdade(26);
        pessoa13.setCidade("Manaus");

        Pessoa pessoa14 = new Pessoa();
        pessoa14.setNome("Eduardo");
        pessoa14.setIdade(38);
        pessoa14.setCidade("Campinas");

        Pessoa pessoa15 = new Pessoa();
        pessoa15.setNome("Camila");
        pessoa15.setIdade(31);
        pessoa15.setCidade("Belém");

        // Efetuar cadastros
         pessoaRepositorio.save(pessoa1);
         pessoaRepositorio.save(pessoa2);
         pessoaRepositorio.save(pessoa3);
         pessoaRepositorio.save(pessoa4);
         pessoaRepositorio.save(pessoa5);
         pessoaRepositorio.save(pessoa6);
         pessoaRepositorio.save(pessoa7);
         pessoaRepositorio.save(pessoa8);
         pessoaRepositorio.save(pessoa9);
         pessoaRepositorio.save(pessoa10);
         pessoaRepositorio.save(pessoa11);
         pessoaRepositorio.save(pessoa12);
         pessoaRepositorio.save(pessoa13);
         pessoaRepositorio.save(pessoa14);
         pessoaRepositorio.save(pessoa15);

    }
}
