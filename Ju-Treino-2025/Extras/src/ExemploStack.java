import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        
        //Last In First Out
        Stack<String> paginas = new Stack<>();

        //cadastro
        paginas.push("www.judev.com");
        paginas.push("www.judev/blog.com");
        paginas.push("www.github/judev.com");

        //remoção
        paginas.pop();

        //Peek
        System.out.println(paginas.peek());

        //Exibir registros
        System.out.println(paginas);


    }
}
