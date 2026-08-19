import java.util.Scanner;
/*Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
números que vem após esse número
(O parâmetro do método deve ser o número inserido pelo usuário)*/

public class exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num = input.nextInt();

        im20num(num);

    }
        public static void im20num(int num) {
            for (int i = num; i <= num + 20; i++) {
                System.out.print(i+" ");
            }
        }
}
