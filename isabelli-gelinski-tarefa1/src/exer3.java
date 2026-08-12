import java.util.Scanner;
/*a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
IMC = Massa / Altura²
Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:
< 18.5 Magreza
18.5 – 24.9 Saudável
25.0 – 29.9 Sobrepeso
30.0 – 34.9 Obesidade Grau I
35.0 – 39.9 Obesidade Grau II (severa)
> 40.0 Obesidade Grau III (morbida)*/

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o seu nome:");
        String nome = sc.next();

        System.out.println("sua altura:");
        double altura = sc.nextDouble();

        System.out.println("seu peso:");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        System.out.println("nome:"+nome+"\n imc:"+imc);

        if (imc<=18.5)
        {
            System.out.println("magreza");
        }else if (imc>18.5 && imc<=24.9)
        {
            System.out.println("Saudavel");
        }else if (imc > 25.0 && imc <=29.9)
        {
            System.out.println("Sobrepeso");
        }else if (imc > 30.0 && imc <=34.9)
        {
            System.out.println("Obesidade Grau I");
        } else if (imc>35.0 && imc<=39.9)
        {
            System.out.println("Obesidade Grau II (severa)");
        } else
        {
            System.out.println("besidade Grau III (morbida)");
        }

    }
}