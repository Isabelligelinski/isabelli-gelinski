/*Faça um método para seus colegas mais próximos
O nome dele(a) é [nome],ele(a) tem [idade] anos,ele(a) é estudante de desenvolvimento de sistemas (Em prints separados)
Faça com que o método seja uma expressão verbal com o nome do seu colega.
O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
executado.*/

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o seu nome");
        String nome = input.next();

        switch (nome)
        {
            case "caio":
                caio();
                break;
            case "hercoles":
                hercoles();
                break;
            case "dani":
                dani();
                break;
        }
    }
    public static void caio()
    {
        System.out.println("nome:caio");
        System.out.println("idade:18");
        System.out.println("é estudante de desenvolvimento de sistemas");
    }
    public static void hercoles()
    {
        System.out.println("nome:hércoles");
        System.out.println("idade:18");
        System.out.println("é estudante de desenvolvimento de sistemas");
    }
    public static void dani()
    {
        System.out.println("nome:dani");
        System.out.println("idade:37");
        System.out.println("é estudante de desenvolvimento de sistemas");
    }
}
