import java.util.Scanner;
/*Faça um programa que descubra:
a) O maior elemento de um vetor
b) O menor elemento
c) A média dos valores
Retorne esses valores*/
public class exer11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double vetor[] = {1,2,3,4,5,-2};

        System.out.println(obterMaiorValor(vetor));
        System.out.println(obterMenorValor(vetor));
        System.out.println(calcularMedia(vetor));
    }

    static public double obterMaiorValor(double vetor[])
    {
        double maiorValor = Double.MIN_VALUE;
        for (int i = 0;i<vetor.length;i++)
        {
            if(vetor[i]>maiorValor)
            {
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }
    static public double obterMenorValor(double vetor[])
    {
        double menorValor = Double.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] < menorValor)
            {
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }
        public static double calcularMedia (double vetor[])
        {
            double soma = 0;

            for (int i = 0; i < vetor.length; i++)
            {
                soma += vetor[i];
            }
            double media = soma / vetor.length;
            return media;
        }
    }

