import java.util.Scanner;
/*Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe:
.O número de inscrição e a altura do atleta mais alto;
.O número de inscrição e a altura do atleta mais baixo;
.A altura média do grupo de atletas.
.A quantidade de atletas cadastrados
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/
public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("nº de inscricao:");
        String inscricao = sc.next();

        System.out.println("altura:");
        double altura = sc.nextDouble();

        double altAlto = 0;
        double altBaixo = Double;

        String insAlto = "";
        String insBaixo = "";

        //enquanto a inscricao for igual a 0,entra.a ! serve para bloquear o loop
        while (!inscricao.equals("0"))
        {
            if (altura > altAlto)
            {
                somaAlt +=altura;
                qtdAltetas++;
                //
                altAlto = altura;
                insAlto = inscricao;
            }
            if (altura < altAlto)
            {
                altBaixo = altura;
                insBaixo = inscricao;
            }
        }
    }
}
