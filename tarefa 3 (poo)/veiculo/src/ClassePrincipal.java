import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        veiculo v1 = new veiculo();
        v1.marca = "honda";
        v1.modelo = "civic";
        v1.placa = "xxx123";
        v1.ano = 2007;
        v1.preco = 50000;

        System.out.println(v1.marca+" "+v1.modelo);
        veiculo v2 = new veiculo();

        v2.marca = "volswagem";
        v2.modelo = "gol";
        v2.placa = "123xxx";
        v2.ano = 2022;
        v2.preco = 20000;

        System.out.println(v2.marca+" "+v2.placa+" "+v2.preco);

    }
}
