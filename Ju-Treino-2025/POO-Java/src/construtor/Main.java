package construtor;

public class Main {
    
    // Anotação para remover o alerta dos objetos criados e não utilizados
    @SuppressWarnings("unused")
    void main() {
        
        Media m1 = new Media();

        Media m2 = new Media(8, 10);

    }

}
