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

public class aeronave2 {

    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeDeCombustivel;
    private double queimaDeCombustivel;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            System.out.println("erro,modelo inválido");
        }else {
            this.modelo = modelo;
        }
    }

    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        if(passageiros<0){
            System.out.println("erro quantidade de passageiros invalida");
        }else {
            this.passageiros = passageiros;
        }
    }


    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if(velocidadeMaxima<=0){
            System.out.println("erro,velocidade invalida");
        }else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }


    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }
    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
       if(capacidadeDeCombustivel<=0){
           System.out.println("erro,capacidade invalida");
       }else {
           this.capacidadeDeCombustivel = capacidadeDeCombustivel;
       }
    }


    public double getQueimaDeCombustivel() {
        return queimaDeCombustivel;
    }
    public void setQueimaDeCombustivel(double queimaDeCombustivel) {
       if(queimaDeCombustivel<=0){
           System.out.println("erro,queima de combustivel invalida");
       }else {
           this.queimaDeCombustivel = queimaDeCombustivel;
       }
    }


    public aeronave2(String modelo, int passageiros, double velocidadeMaxima, double capacidadeDeCombustivel, double queimaDeCombustivel) {
        setModelo(modelo);
        setPassageiros(passageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeDeCombustivel(capacidadeDeCombustivel);
        setQueimaDeCombustivel(queimaDeCombustivel);

    }

    public double calcularAltomonomia(){
        return capacidadeDeCombustivel/queimaDeCombustivel;
    }
    public double calcularDistancia(){
        return calcularAltomonomia() * velocidadeMaxima;
    }

}
