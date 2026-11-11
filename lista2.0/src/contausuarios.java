public class contausuarios {
    public static void main(String[] args) {
        conta c1 = new conta("joao",10000);
        conta c2 = new conta("lucas",5000);
        conta c3 = new conta("dani",25000);
        conta c4 = new conta("isa",30000);

        c1.depositarValor(400);
        c1.sacarValor(500);
        System.out.println(c1);

        c1.transferirValor(500,c2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c2.simularInvestimento(500,10));
    }
}
