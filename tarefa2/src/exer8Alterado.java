import java.util.Scanner;
/*Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas
notas. Retorne a média, insira um numero entre 0 e 10.caso for maior que 10,será mudado para 0. */
public class exer8Alterado {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("p1:");
    double num1 = input.nextDouble();
    System.out.println("p2:");
    double num2 = input.nextDouble();
    System.out.println("p3:");
    double num3 = input.nextDouble();

    System.out.println(calcularMedia(num1, num2, num3));
}

public static double calcularMedia( double num1, double num2, double num3) {
        if(num1<0 || num1>10 || num2<0 || num2>10 || num3<0 || num3>10)
        {
            return 0;
        }
    return (num1 + num2 + num3) / 3;
    }
}
