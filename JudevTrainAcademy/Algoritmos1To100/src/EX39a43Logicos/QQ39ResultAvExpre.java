package EX39a43Logicos;

public class QQ39ResultAvExpre {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = true;
        boolean C = false;

        boolean resultadoA = (A && B) || (A ^ B);
        System.out.println("Resultado da expressão a: " + resultadoA);

        boolean resultadoB = (A || B) && (A && C);
        System.out.println("Resultado da expressão b: " + resultadoB);

        boolean resultadoC = A || (C && (B ^ (A && !B)));
        System.out.println("Resultado da expressão c: " + resultadoC);
    }
}

/*Expressão a: (A && B) || (A ^ B)

A && B é true && true que resulta em true.
A ^ B é true ^ true que resulta em false (XOR de dois valores iguais é false).
(true) || (false) resulta em true.
Expressão b: (A || B) && (A && C)

A || B é true || true que resulta em true.
A && C é true && false que resulta em false.
(true) && (false) resulta em false.
Expressão c: A || C && B ^ A && !B

!B é !true que resulta em false.
A && !B é true && false que resulta em false.
B ^ (A && !B) é true ^ false que resulta em true.
C && (B ^ (A && !B)) é false && true que resulta em false.
A || (C && (B ^ (A && !B))) é true || false que resulta em true.
Portanto, os resultados das expressões são:

a) true
b) false
c) true */
