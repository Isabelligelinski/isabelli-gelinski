public class classeRaio {
    public static void main(String[] args) {
        circulo c1 = new circulo();
        circulo c2 = new circulo();
        circulo c3 = new circulo();
        circulo c4 = new circulo();

        c1.raio = 1;
        c2.raio = 2.5;
        c3.raio = 3;
        c4.raio = 4.5;

        System.out.println("Circulo 1:"+c1.calcularArea());
        System.out.println("Circulo 2:"+c2.calcularArea());
        System.out.println("Circulo 3:"+c3.calcularArea());
        System.out.println("Circulo 4:"+c4.calcularArea());


    }
}
