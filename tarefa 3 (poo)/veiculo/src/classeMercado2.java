public class classeMercado2 {
    public static void main(String[] args) {


        mercado2 unidadeDeBlumenau = new mercado2("giassi",25,5,15,6);
        unidadeDeBlumenau.nome = "giassi";
        unidadeDeBlumenau.numeroDasMacasVendidasNoAno = 25;
        unidadeDeBlumenau.precoDeVendasDasMacas = 5;
        unidadeDeBlumenau.numeroDasLaranjaVendidasNoAno = 15;
        unidadeDeBlumenau.precoDeVendasDasLaranjas =6;

        mercado2 unidadeDeJoinville = new mercado2("angeloni",30,2.5,10,5);
        unidadeDeJoinville.nome = "angeloni";
        unidadeDeJoinville.numeroDasMacasVendidasNoAno = 30;
        unidadeDeJoinville.precoDeVendasDasMacas = 2.5;
        unidadeDeJoinville.numeroDasLaranjaVendidasNoAno = 10;
        unidadeDeJoinville.precoDeVendasDasLaranjas = 5;

        mercado2 unidadeDeFlorianopolis = new mercado2("superA",40,5,50,7);
        unidadeDeFlorianopolis.nome = "superA";
        unidadeDeFlorianopolis.numeroDasMacasVendidasNoAno = 40;
        unidadeDeFlorianopolis.precoDeVendasDasMacas = 5;
        unidadeDeFlorianopolis.numeroDasLaranjaVendidasNoAno = 50;
        unidadeDeFlorianopolis.precoDeVendasDasLaranjas = 7;

        mercado2 mercados[] = {unidadeDeBlumenau,unidadeDeFlorianopolis,unidadeDeJoinville};

            double maiorMaca = 0;
            mercado2 mercadoMaiorMacas = null;

              for (int i=0;i< mercados.length;i++){
                 if (mercados[i].calcularMacas()>maiorMaca){
                 maiorMaca = mercados[i].calcularMacas();
                 mercadoMaiorMacas = mercados[i];
                }
            }
            System.out.println("mercado:"+mercadoMaiorMacas.nome+"\nMenor receita de maças:R$ "+maiorMaca);

            double menorLaranja = Double.MAX_VALUE;
            mercado2 mercadoMenorlaranjas = null;

            for (int i=0;i< mercados.length;i++){
              if (mercados[i].calcularLaranjas()<menorLaranja) {
              menorLaranja = mercados[i].calcularLaranjas();
              mercadoMenorlaranjas = mercados[i];
                }
            }
        System.out.println("mercado:"+mercadoMenorlaranjas.nome+"\nMenor receita de laranjas:R$ "+menorLaranja);
        }
    }
