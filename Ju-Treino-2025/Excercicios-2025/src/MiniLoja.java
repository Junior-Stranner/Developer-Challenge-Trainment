import java.util.Scanner;

public class MiniLoja {
    public static void main(String[] args) {
        
       /*
    Informe o código do produto e a quantidade, em seguida retorne o total a pagar.

    Produtos:
    1 | Camisa Masculina Azul   | R$59,90
    2 | Calça Jeans Feminina    | R$129,90
    3 | Bermuda Masculina       | R$79,90
    4 | Blusa Feminina Amarela  | R$57,70
    5 | Camisa Masculina Verde  | R$64,90
*/

  // Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("1 | Camisa Masculina Azul   | R$59,90");
        System.out.println("2 | Calça Jeans Feminina    | R$129,90");
        System.out.println("3 | Bermuda Masculina       | R$79,90");
        System.out.println("4 | Blusa Feminina Amarela  | R$57,70");
        System.out.println("5 | Camisa Masculina Verde  | R$64,90");
        int codigo = in.nextInt();

        System.out.println("Informe a quantidade");
        int quantidade = in.nextInt();

        in.close();

         switch(codigo){
            case 1:System.out.println(59.90 * quantidade);break;
            case 2:System.out.println(129.90 * quantidade);break;
            case 3:System.out.println(79.90 * quantidade);break;
            case 4:System.out.println(57.70 * quantidade);break;
            case 5: System.out.println(64.90 * quantidade); break;
        }
    }
}
