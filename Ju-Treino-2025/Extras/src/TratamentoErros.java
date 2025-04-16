import java.util.Scanner;

public class TratamentoErros {
    public static void main(String[] args) {
        //Scanner 
        Scanner in = new Scanner(System.in);


        try{
        
        //Obter um número inteiro
        System.out.println("Informe um número inteiro");
        int numero = Integer.parseInt(in.nextLine());

        //Exibir número
        System.out.println("O número informado é: "+numero);

        }catch(Exception e){
            //mensagem
           e.printStackTrace();
           System.out.println("Falha: "+e);
        }finally{
            in.close();
        }
    }
}
