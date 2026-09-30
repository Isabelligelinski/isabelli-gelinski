/*Acelerar: que deve somar a velocidade do parâmetro com a velocidade do carro (usar setVelocidade),
 desde que o valor do parâmetro seja maior ou igual a zero e menor que 20.Senão, lance uma exceção
Reduzir: que deve subtrair a velocidade do carro com a velocidade do parâmetro (usar setVelocidade),
desde que o valor do parâmetro seja maior ou igual a zero e menor que 30.Senão, lance uma exceção*/

public class vlCarro {

    private double velocidade;
    public vlCarro (double velocidade){
      setVelocidade(velocidade);
    }

    public void acelerar(double aceleracao){
        if (aceleracao <0 || aceleracao >=20){
            throw new IllegalArgumentException("Aceleracao invalida");
        }
        setVelocidade(velocidade+aceleracao);
    }
    public void reduzir(double reducao) {
        if (reducao < 0 || reducao >= 30) {
            throw new IllegalArgumentException("Reducao invalida");
        }
        setVelocidade(velocidade-reducao);
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(double velocidade){
        if (velocidade<0){
            throw new IllegalArgumentException("velocidade nao pode ser negativo");
        }
        this.velocidade = velocidade;
    }

}
