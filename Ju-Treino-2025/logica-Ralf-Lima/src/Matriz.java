public class Matriz {
    public static void main(String[] args) {
        
        //Matriz
        String[][] clientes ={
            {"Julia", "São Paulo"},
            {"Paulo","Laguna"},
            {"Junior", "BC"},
        };
        for(int indice =0; indice <=3; indice++){
        System.out.println("Nome" + clientes[indice][0]);
        System.out.println("Cidades" + clientes[indice][1]);
        System.out.println();
        }
    }
}
