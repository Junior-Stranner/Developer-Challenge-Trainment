public class Programa {
    public static void main(String[] args) throws Exception {
        ListaLigada<String> lista = new ListaLigada<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");  
        lista.adicionar("DF");
        System.out.println("Tamanho: " +lista.getTamanho());
        System.out.println("Primeiro: " +lista.getPrimeiro().getValor());
        System.out.println("último: " +lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

        for(int i =0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        //remover estado CE
       lista.remover("CE");
       System.out.println("Removey estado CE");
       lista.adicionar("SC");
       System.out.println("Adicionando o estado de SC");
        for(int i =0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
