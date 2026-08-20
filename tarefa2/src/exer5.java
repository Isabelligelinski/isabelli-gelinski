import java.util.Scanner;
/*Faça um método que receba três números inseridos pelo usuário, esses números
serão: um número "base" e mais dois outros números que o usuário inseriu
Imprima qual dos dois últimos números está mais perto do primeiro número "base" */
public class exer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe um numero base:");
        int numb = input.nextInt();
        System.out.println("primeiro numero:");
        int num1 = input.nextInt();
        System.out.println("segundo numero:");
        int num2 = input.nextInt();

        numprob(numb, num1, num2);
    }
    public static void numprob(int numb, int num1,int num2){
       int disbase1 = num1 - numb;
       int disbase2 = num2 - numb;

       if(disbase1<disbase2){
           System.out.println("o numero mairs proximo é:"+num1);
       }else if (disbase2<disbase1){
           System.out.println("o numero mais proximo é:"+num2);
       }else {
           System.out.println("a distâcia é igual");
       }
    }
}
