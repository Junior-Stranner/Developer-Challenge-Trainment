/** 
 * Classe principal.
 * 
 * @author Ralf Lima
 * @version 1.0
 */
public class Main {

    /**
     * Método principal.
     */
    void main() {
        // Criar objeto
        Pessoa pessoa = new Pessoa("Junior", 23);
        
        // Método de apresentação
        pessoa.apresentacao();

        // Exibir a situação da idade
        System.out.println(pessoa.verificarIdade());
    }
}

/*[COMANDO PARA GERAR A DOCUMENTAÇÃO]
javadoc -d docs *.java */
