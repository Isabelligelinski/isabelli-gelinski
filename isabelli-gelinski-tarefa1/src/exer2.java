import java.util.Scanner;
/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em R$).
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
 informe o total a receber no final do mês, com duas casas decimais.*/

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o seu nome:");
        String nome = sc.next();

        System.out.println("salario fixo:");
        double salarioF = sc.nextDouble();

        System.out.println("total de vendas no mês:");
        double totalV = sc.nextInt();

        double comissao = totalV*0.15;
        double salario = salarioF+comissao;


        System.out.println("salario:"+salario);
    }
}