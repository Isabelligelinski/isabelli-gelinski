import java.util.Scanner;
/*Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, imprima:
verão e está quente ou é inverno e está frio*/
public class exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe um numero (1 á 4)");
        int opcao = input.nextInt();

        switch (opcao)
        {
            case 1:
                verao();
                break;
            case 2:
                outono();
                break;
            case 3:
                primavera();
                break;
            case 4:
                inverno();
                break;
        }

    }
    public static void verao()
    {
        System.out.println("É verão, época de comer churrasco e ir para a praia");
    }
    public static void outono()
    {
        System.out.println("É outono, época do halloween");
    }
    public static void primavera()
    {
        System.out.println("É primavera, época florida");
    }
    public static void inverno()
    {
        System.out.println("É inverno, época dos ursos hibernarem");
    }
}
