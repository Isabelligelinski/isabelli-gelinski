import java.util.Scanner;
/*Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, retorne:
É verão e está quente Ou É inverno e está frio.
Faça um método para cada estação do ano*/

public class exer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero entre 1 e 4:");
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println(verao());
        } else if (opcao == 2) {
            System.out.println(outono());
        } else if (opcao == 3) {
            System.out.println(primavera());
        } else if (opcao == 4) {
            System.out.println(inverno());
        }
    }
    public static String verao(){return "É verão, época de comer churrasco e ir para a praia";}
    public static String outono(){
        return "É outono, época do halloween";
    }
    public static String primavera(){
        return "É primavera, época florida";
    }
    public static String inverno(){
        return "É inverno, época dos ursos hibernarem";
    }
}
