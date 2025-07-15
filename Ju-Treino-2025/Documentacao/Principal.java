/** 
 * Classe principal.
 * 
 * @author Ralf Lima
 * @version 1.0
 */
public class Principal {

    /**
     * Método principal.
     */
    void main() {
        // Criar objeto
        PessoaExemplo pessoa = new PessoaExemplo("Junior", 23);
        
        // Método de apresentação
        pessoa.apresentacao();

        // Exibir a situação da idade
        System.out.println(pessoa.verificarIdade());
    }
}

/*[COMANDO PARA GERAR A DOCUMENTAÇÃO]
javadoc -d docs *.java */
