public class classeVlCarro {
    public static void main(String[] args) {

        vlCarro c1 = new vlCarro(50);
        System.out.println(c1.getVelocidade());

        c1.acelerar(5);
        System.out.println(c1.getVelocidade());

        c1.reduzir(15);
        System.out.println(c1.getVelocidade());
    }
}
