package Ex77a91Vetores;
import java.util.Scanner;

public class Q85TemperaturaMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   

        double[] TempMedia = new double[10];

        for (int i = 0; i < TempMedia.length; i++) {
            System.out.println("Digite a temperatura do dia " + (i + 1) + ": ");
            TempMedia[i] = Double.parseDouble(in.nextLine());
        }
        int op = 0; 

        do {
            System.out.println("1 - Menor temperatura do ano"
                + "\n2 - Maior temperatura do ano"
                + "\n3 - Temperatura média anual"
                + "\n4 - O número de dias no ano em que a temperatura foi inferior à média anual"
                + "\n5 - Sair");
            op = Integer.parseInt(in.nextLine());

            switch (op) {
                case 1:menorTemperaturaAno(TempMedia);break;
                case 2:maiorTemperaturaAno(TempMedia);break;
                case 3:mediaTemperaturaAno(TempMedia);break;
                case 4:diasAnoTempInferiorMedia(TempMedia);break;
                case 5:System.out.println("Saindo...");break;
                default:System.out.println("Opção inválida!");break;
            }
        } while (op != 5);

    }
    public static void menorTemperaturaAno(double[] TempMedia) {
        double menor = Double.MAX_VALUE; 
        for (double temp : TempMedia) {
            if (temp < menor) {
                menor = temp;
            }
        }
        System.out.println("Menor temperatura do ano: " + menor);
    }

    public static void maiorTemperaturaAno(double[] TempMedia) {
        double maior = TempMedia[0];
        for (double temp : TempMedia) {
            if (temp > maior) {
                maior = temp;
            }
        }
        System.out.println("Maior temperatura do ano: " + maior);
    }

    public static void mediaTemperaturaAno(double[] TempMedia) {
        double soma = 0;
        for (double temp : TempMedia) {
            soma += temp;
        }
        double media = soma / TempMedia.length;
        System.out.println("Temperatura média anual: " + media);
    }

    public static void diasAnoTempInferiorMedia(double[] TempMedia) {
        double soma = 0;
        for (double temp : TempMedia) {
            soma += temp;
        }
        double media = soma / TempMedia.length;

        int diasInferior = 0;
        for (double temp : TempMedia) {
            if (temp < media) {
                diasInferior++;
            }
        }
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasInferior);
    }
}
