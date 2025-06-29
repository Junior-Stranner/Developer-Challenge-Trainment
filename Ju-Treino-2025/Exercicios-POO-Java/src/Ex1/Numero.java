

public class Numero {
    private int numero;


    public Numero(int numero) {
        this.numero = numero;
 
        patImpar();
        positivoNegativo();
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void positivoNegativo(){
         if(this.numero >=0){
            System.out.println("Positivo");
         }else{
            System.out.println("Negativo");
         }
    }

    public void patImpar(){
     System.out.println(numero % 2 ==0 ? "par" : "impar");
    }
}
