import java.util.Scanner;

public class Q10JogoPerguntasRespostas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Perguntas e respostas
        String[][] perguntas = {
            {"Qual é a capital da França?", "A) Paris", "B) Londres", "C) Roma", "D) Berlim", "A"},
            {"Qual é o maior planeta do sistema solar?", "A) Terra", "B) Júpiter", "C) Marte", "D) Saturno", "B"},
            {"Qual é o símbolo químico do ouro?", "A) Au", "B) Ag", "C) Fe", "D) Pb", "A"},
            {"Quem escreveu 'Dom Casmurro'?", "A) Machado de Assis", "B) José de Alencar", "C) Jorge Amado", "D) Clarice Lispector", "A"},
            {"Qual é o número atômico do carbono?", "A) 6", "B) 8", "C) 12", "D) 14", "A"},
            {"Qual é o continente onde está localizado o Egito?", "A) Ásia", "B) Europa", "C) África", "D) América", "C"},
            {"Quem pintou a Mona Lisa?", "A) Van Gogh", "B) Picasso", "C) Leonardo da Vinci", "D) Michelangelo", "C"},
            {"Qual é a língua oficial do Brasil?", "A) Espanhol", "B) Inglês", "C) Francês", "D) Português", "D"},
            {"Quem descobriu o Brasil?", "A) Cristóvão Colombo", "B) Pedro Álvares Cabral", "C) Vasco da Gama", "D) Fernão de Magalhães", "B"},
            {"Qual é o maior oceano do mundo?", "A) Atlântico", "B) Índico", "C) Ártico", "D) Pacífico", "D"}
        };

        int acertos = 0;
        int erros = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i][0]);
            System.out.println("A) " + perguntas[i][1].substring(3));
            System.out.println("B) " + perguntas[i][2].substring(3));
            System.out.println("C) " + perguntas[i][3].substring(3));
            System.out.println("D) " + perguntas[i][4].substring(3));

            System.out.print("Sua resposta (A, B, C, D): ");
            String resposta = in.nextLine().toUpperCase();

            if (resposta.equals(perguntas[i][5])) {
                System.out.println("Resposta correta!");
                acertos++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + perguntas[i][5]);
                erros++;
            }

            System.out.println(); // Linha em branco para separar as perguntas
        }

        System.out.println("Fim do jogo!");
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.println("Quantidade de erros: " + erros);

    }
}

