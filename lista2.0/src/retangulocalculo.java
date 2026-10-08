public class retangulocalculo {
    public static void main(String[] args) {
        retangulo r1 = new retangulo(10,5);
        retangulo r2 = new retangulo(40,2);

        retanguloLista re1 = new retanguloLista();
            re1.adcionarnumeros(r1);
            re1.adcionarnumeros(r2);

        System.out.println(re1.maiorArea());
        System.out.println(re1.maiorPerimetro());
    }
}
