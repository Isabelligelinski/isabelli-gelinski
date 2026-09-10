public class mercado2 {
    String nome;
    int numeroDasMacasVendidasNoAno;
    double precoDeVendasDasMacas;
    int numeroDasLaranjaVendidasNoAno;
    double precoDeVendasDasLaranjas;

    public double calcularMacas(){
    return numeroDasMacasVendidasNoAno*precoDeVendasDasMacas;
    }

    public double calcularLaranjas(){
    return  numeroDasLaranjaVendidasNoAno*precoDeVendasDasLaranjas;
    }

    @Override
    public String toString() {
        return "mercado2{" +
                "nome='" + nome + '\'' +
                ", numeroDasMacasVendidasNoAno=" + numeroDasMacasVendidasNoAno +
                ", precoDeVendasDasMacas=" + precoDeVendasDasMacas +
                ", numeroDasLaranjaVendidasNoAno=" + numeroDasLaranjaVendidasNoAno +
                ", precoDeVendasDasLaranjas=" + precoDeVendasDasLaranjas +
                '}';
    }

    public mercado2(String nome, int numeroDasMacasVendidasNoAno, double precoDeVendasDasMacas, int numeroDasLaranjaVendidasNoAno, double precoDeVendasDasLaranjas) {
        this.precoDeVendasDasLaranjas = precoDeVendasDasLaranjas;
        this.numeroDasLaranjaVendidasNoAno = numeroDasLaranjaVendidasNoAno;
        this.precoDeVendasDasMacas = precoDeVendasDasMacas;
        this.numeroDasMacasVendidasNoAno = numeroDasMacasVendidasNoAno;
        this.nome = nome;
    }

    public double calcularTotal(){
        return calcularMacas()+calcularLaranjas();
    }
}
