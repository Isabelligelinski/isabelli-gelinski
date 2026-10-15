import java.awt.*;

//(lista2-exer2)
public class floriculturaLista {
    public static void main(String[] args) {
        flor f1 = new flor("joao","rosa",15);
        flor f2 = new flor("joao","tulipa",15);
        flor f3 = new flor("joao","violeta",15);
        flor f4 = new flor("lucas","lirio",15);
        flor f5 = new flor("lucas","lavanda",15);
        flor f6 = new flor("marcos","rosa",15);
        flor f7 = new flor("marcos","cravo",15);
        flor f8 = new flor("marcos","girassol",15);
        flor f9 = new flor("rafael","lavanda",15);

        florclasse floricultura = new florclasse();

        floricultura.adcionarFlores(f1);
        floricultura.adcionarFlores(f2);
        floricultura.adcionarFlores(f3);
        floricultura.adcionarFlores(f4);
        floricultura.adcionarFlores(f5);
        floricultura.adcionarFlores(f6);
        floricultura.adcionarFlores(f7);
        floricultura.adcionarFlores(f8);
        floricultura.adcionarFlores(f9);

        System.out.println(floricultura.pesquisaflor("joao"));
    }
}
