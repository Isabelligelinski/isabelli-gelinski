public class classeMercado {
    public static void main(String[] args) {

         mercado unidadeDeBlumenau = new mercado();

         unidadeDeBlumenau.nome = "giassi";
         unidadeDeBlumenau.numeroDasMacasVendidasNoAno = 25;
         unidadeDeBlumenau.precoDeVendasDasMacas = 5;
         unidadeDeBlumenau.numeroDasLaranjaVendidasNoAno = 15;
         unidadeDeBlumenau.precoDeVendasDasLaranjas =6;

         mercado unidadeDeJoinville = new mercado();

         unidadeDeJoinville.nome = "angeloni";
         unidadeDeJoinville.numeroDasMacasVendidasNoAno = 30;
         unidadeDeJoinville.precoDeVendasDasMacas = 2.5;
         unidadeDeJoinville.numeroDasLaranjaVendidasNoAno = 10;
         unidadeDeJoinville.precoDeVendasDasLaranjas = 5;

         mercado unidadeDeFlorianopolis = new mercado();

         unidadeDeFlorianopolis.nome = "superA";
         unidadeDeFlorianopolis.numeroDasMacasVendidasNoAno = 40;
         unidadeDeFlorianopolis.precoDeVendasDasMacas = 5;
         unidadeDeFlorianopolis.numeroDasLaranjaVendidasNoAno = 50;
         unidadeDeFlorianopolis.precoDeVendasDasLaranjas = 7;

         System.out.println("mercado:"+unidadeDeBlumenau.nome+"\nquantidade de macas vendidas:"+unidadeDeBlumenau.numeroDasMacasVendidasNoAno+"\npreco:"+unidadeDeBlumenau.precoDeVendasDasMacas);
         System.out.println("mercado:"+unidadeDeFlorianopolis.nome+"\nquantidade de maças vendidas:"+unidadeDeFlorianopolis.numeroDasMacasVendidasNoAno+"\npreco:"+unidadeDeFlorianopolis.precoDeVendasDasMacas);
         System.out.println("mercado:"+unidadeDeJoinville.nome+"\nquantidade de maças vendidas:"+unidadeDeJoinville.numeroDasMacasVendidasNoAno+"\npreco:"+unidadeDeJoinville.precoDeVendasDasMacas);
    }




}
