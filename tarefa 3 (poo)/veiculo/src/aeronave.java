/*Faça uma classe chamada Aeronave.
Com os atributos:
• Modelo
• Passageiros
• Velocidade máxima
• Capacidade de combustível
• Queima de combustível por minuto
Crie 4 objetos de sua preferência.
Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar mais tempo no ar?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais
longe*/

public class aeronave {

    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeDeCombustivel;
    double queimaDeCombustivel;

    @Override
    public String toString() {
        return "aeronave{" +
                "modelo='" + modelo + '\'' +
                ", passageiros=" + passageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", capacidadeDeCombustivel=" + capacidadeDeCombustivel +
                ", queimaDeCombustivel=" + queimaDeCombustivel +
                '}';
    }

    public aeronave( String modelo,int passageiros,double velocidadeMaxima,double capacidadeDeCombustivel,double queimaDeCombustivel) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
        this.queimaDeCombustivel = queimaDeCombustivel;

    }
    public double calcularAltomonomia(){
        return capacidadeDeCombustivel/queimaDeCombustivel;
    }
    public double calcularDistancia(){
        return calcularAltomonomia() * velocidadeMaxima;
    }

}
