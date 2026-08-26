import java.util.Scanner;
/*Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas
notas. Retorne a média */
public class exer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("p1:");
        double num1 = input.nextDouble();
        System.out.println("p2:");
        double num2 = input.nextDouble();
        System.out.println("p3:");
        double num3 = input.nextDouble();

        System.out.println(caucularMedia(num1, num2, num3));
    }
        public static double caucularMedia ( double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;

        }
    }
