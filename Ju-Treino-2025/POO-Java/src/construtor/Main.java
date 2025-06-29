package construtor;

public class Main {
    
    // Anotação para remover o alerta dos objetos criados e não utilizados
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        
        Media m1 = new Media();

        Media m2 = new Media(8, 10);

    }

}
