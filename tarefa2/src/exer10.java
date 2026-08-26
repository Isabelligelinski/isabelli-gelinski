import java.util.Scanner;
/*Faça um programa que diz se um número inserido está dentro de um limite imposto
pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos.*/
public class exer10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("insira um numero (máximo):");
        int numMax = input.nextInt();
        System.out.println("insira um numero (mínimo):");
        int numMin = input.nextInt();
        System.out.println("insira um numero:");
        int num = input.nextInt();

        System.out.println(verificarLimites(numMax, numMin, num));
    }
    public static String verificarLimites(int numMax, int numMin, int num){
        if(num>numMin && num<numMax){
            return num+" está dentro dos limites";
        }
            return num+" não está dentro dos limites";
    }

}
