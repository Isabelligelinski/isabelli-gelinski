import java.text.DecimalFormat;
import java.util.Scanner;

/*1) Escreva um programa que leia o número de matrícula um funcionário, seu nome,sua quantidade de horas trabalhadas na semana,
 o valor que recebe por hora
 calcule o salário mensal desse funcionário.
 (assuma que um mês tem 4 semanas).
 A seguir, mostre a sua matrícula, nome e o salário do funcionário, com duas casas decimais*/

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("informe o numero da sua matricula:");
        String matricula = sc.next();

        System.out.println("nome:");
        String nome = sc.next();

        System.out.println("quantidade de horas trabalhadas:");
        double horas = sc.nextDouble();

        System.out.println("valor que recebe por hora:");
        double valorH = sc.nextDouble();

        double salario = valorH * horas * 4;

        System.out.println(" matricula:" + matricula + "\n funcionario (" + nome + ")\n salário:R$" + df.format(salario));

        sc.close();
    }
}