import java.util.Scanner;
/*Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par,
retorne o primeiro caractere dessa palavra.
Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.*/
public class exer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira a palavra");
        String palavra = input.next();

        System.out.println(obterCaractere(palavra));
    }
    public static char obterCaractere(String palavra){
        if (palavra.length() % 2 == 0) {
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }

}
