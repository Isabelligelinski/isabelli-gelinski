import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer>num = new ArrayList<Integer>();

        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);

        System.out.println("insira um numero:");
        int numero = sc.nextInt();

        if (num.contains(numero)){
            System.out.println("posicao:"+num.indexOf(numero));
        }else {
            System.out.println("Não esta na lista");
        }

    }
}
