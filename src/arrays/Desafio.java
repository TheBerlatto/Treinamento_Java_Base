package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Desafio proposto via curso Udemy.
        //Requisitos: Entrada do usuário; Dois laços for obrigatórios(1 for e 1 foreach)
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas a serem digitadas: ");
        int qtdeNotas = in.nextInt();

        double[] notas = new double[qtdeNotas];
        for (int i = 0; i < qtdeNotas; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            double nota = in.nextDouble();
            notas[i] = nota;
        }

        double somaNotas = 0;
        for (double nota: notas){
            somaNotas += nota;
        }

        double media = (somaNotas / qtdeNotas);

        System.out.println("A média do aluno é: " + media);

    }
}
