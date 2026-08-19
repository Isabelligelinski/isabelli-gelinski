import java.util.Scanner;
/*Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores */
public class exer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int vetor[] = {1,2,3,4,5};

       maiorvalor(vetor);
       menorvalor(vetor);
       mediavalor(vetor);
    }
    public static void maiorvalor(int vetor[]) {
        int maiorvalor = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorvalor) {
                maiorvalor = vetor[i];
            }
        }
        System.out.println("maior valor:" + maiorvalor);
    }

    public static void menorvalor(int vetor[]) {
        int menorvalor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorvalor) {
                menorvalor = vetor[i];
            }
        }

        System.out.println("menor valor:" + menorvalor);
    }
    public static void mediavalor(int vetor[]) {
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;

        System.out.println("a media os valores é:" + media);
    }
}
