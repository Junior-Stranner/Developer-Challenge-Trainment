
public class Horario {
  private String cidade;
    private int hora;

       // Construtor
    public Horario(String cidade, int hora){
        this.cidade = cidade;
        this.hora = hora;

        System.out.println("Horário em " + cidade + " é: " + novoHorario());
    }

     private int novoHorario(){
        int horarioLocal = 0;

        switch(cidade){
            case "Nova Iorque":
            horarioLocal = hora - 1;
            break;

            case "Tóquio":
            horarioLocal = hora + 12;
            break;

            case "Lisboa":
            horarioLocal = hora + 3;
            break;
        }

        if(horarioLocal > 23){
            horarioLocal -= 24;
        }   

        return horarioLocal;
    }
    
}
