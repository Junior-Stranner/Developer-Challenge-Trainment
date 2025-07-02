import javax.swing.JOptionPane;

public class Projeto {

    public static void main(String args[]) {

        // Mensagem
        JOptionPane.showMessageDialog(null, "Hello World!");

    }

}

/*
 * [COMANDOS UTILIZADOS]
1º Gerar o arquivo .class
javac -d pasta Projeto.java

2º Gerar o arquivo .jar
jar cvfe projeto.jar Projeto -C pasta/ .

3º Executar projeto .jar
java -jar projeto.jar

 */