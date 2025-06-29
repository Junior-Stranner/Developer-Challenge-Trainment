package Ex3;


/*
Crie um sistema para calcular médias. Haverá três construtores:
- public Media(double nota1, double nota2);
- public Media(double nota1, double nota2, double nota3);
- public Media(double nota1, double nota2, double nota3, double nota4);

O construtor deverá realizar o cálculo e retornar uma mensagem com a média. */

public class Media {
    private double n1;
    private double n2;
    private double n3;
    private double n4;

 public Media(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
   
        System.out.println((n1 + n2 )/ 2);
    }

     public Media(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

      System.out.println((n1 + n2 + n3) / 3);

    }

    public Media(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;

      System.out.println((n1 + n2 + n3 + n4) / 4);

    }

}
