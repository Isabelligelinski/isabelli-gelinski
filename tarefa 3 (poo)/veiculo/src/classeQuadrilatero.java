public class classeQuadrilatero {
    public static void main(String[] args) {
        quadrilatero q1 = new quadrilatero();
        q1.altura = 3;
        q1.largura = 2.5;
        System.out.println(q1.obterPerimetro());

        quadrilatero q2 = new quadrilatero();
        q2.altura = 6;
        q2.largura = 9;
        System.out.println(q2.obterPerimetro());
    }
}
