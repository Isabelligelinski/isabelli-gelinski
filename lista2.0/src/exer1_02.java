import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer1_02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);

        System.out.println("insira um numero:");
        int numero = sc.nextInt();

        int indice = num.indexOf(numero);

        if (indice != -1) {
            System.out.println("posicao:" + indice);
        } else {
            System.out.println("Não esta na lista");
        }
    }
}
