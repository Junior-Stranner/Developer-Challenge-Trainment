package br.com.judev.EasyMode;

public class Q02oqSeraImpreso {
    public static void main(String[]args){

        System.out.println("A)");
        int aA =10;
        int aB = 20;
       System.out.println("B "+aB);
       aB = 5;
       System.out.println("A "+aA +" , B "+ aB);


       System.out.println("-------------------------------------------------");

        System.out.println("B)");
      
        int bA = 30;         // bA recebe o valor 30
        int bB = 20;         // bB recebe o valor 20
        int bC = bA + bB;    // bC recebe a soma de bA e bB, ou seja, 30 + 20 = 50
        System.out.println("C "+bC);  // imprime: 50

        bB = 20;            // bB é alterado para 20 novamente (sem efeito na variável bC)
        System.out.println("B "+bB + " , c " + bC);  // imprime: 20 , 50

        bC = bA + bB;       // bC recebe a soma atualizada de bA e bB, ou seja, 30 + 20 = 50
        System.out.println("A "+bA + " , B " + bB + " ,  C " + bC);  // imprime: 30 , 20 , 50

        System.out.println("-------------------------------------------------");

        System.out.println("C)");

        int cA = 10;  // cA recebe o valor 10
        int cB = 20;  // cB recebe o valor 20
        int cC = cA;  // cC recebe o valor de cA, ou seja, 10
        cB = cC;      // cB recebe o valor de cC, que também é 10
        cA = cB;      // cA recebe o valor de cB, que agora é 10
        System.out.println("A "+cA + " , B " + cB + " , C " + cC);  // imprime: 10 , 10 , 10

        System.out.println("-------------------------------------------------");

        System.out.println("D)");

        int dA = 10;       // dA recebe o valor 10
        int dB = dA + 1;   // dB recebe o valor de dA + 1, ou seja, 10 + 1 = 11
        dA = dB + 1;       // dA recebe o valor de dB + 1, ou seja, 11 + 1 = 12
        dB = dA + 1;       // dB recebe o valor de dA + 1, ou seja, 12 + 1 = 13
        System.out.println(dA);  // imprime: 12
        dA = dB + 1;       // dA recebe o valor de dB + 1, ou seja, 13 + 1 = 14
        System.out.println("A " + dA + " , B " + dB);  // imprime: A 14 , B 13
        

        System.out.println("-------------------------------------------------");

        System.out.println("E)");

        int eA = 10;      // eA recebe o valor 10
        int eB = 5;       // eB recebe o valor 5
        int eC = eA + eB; // eC recebe a soma de eA e eB, ou seja, 10 + 5 = 15
        eB = 20;          // eB recebe o valor 20
        eA = 10;          // eA recebe o valor 10 novamente, não há mudança efetiva
        System.out.println("A "+eA + " , B " + eB + " , C " + eC);  // imprime: 10 , 20 , 15

        System.out.println("-------------------------------------------------");
        System.out.println("F)");


        int x = 10;      // x recebe o valor 10
        int y = 5;       // y recebe o valor 5
        int z = y - x;   // z recebe a diferença entre y e x, ou seja, 5 - 10 = -5
        System.out.println("Z " + z);  // imprime: Z -5
        
        x = 5;          // x é atualizado para 5
        y = x + z;      // y recebe a soma de x e z, ou seja, 5 + (-5) = 0
        System.out.println("X " + x + " , Y " + y + " , Z " + z);  // imprime: X 5 , Y 0 , Z -5

        System.out.println("-------------------------------------------------");

      
    }
}

/* 2) Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados: 
*/
