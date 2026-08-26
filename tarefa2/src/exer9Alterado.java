import java.util.Scanner;

public class exer9Alterado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indira um numero:");
        int num = input.nextInt();

        System.out.println(determinar(num));
    }
    public static boolean determinar (int num)
    {
        return num %2 ==0;
    }
}
