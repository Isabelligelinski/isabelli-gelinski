/*(lista2-exer1)
Faça uma classe chamada Retangulo, com os atributos altura e largura.
Na classe Retângulo:
• Faça um método para descobrir a área e outro para descobrir o perímetro do retângulo
Na classe que terá a lista de Retângulos crie métodos para obter:
• O Retangulo com a maior área
• O Retangulo com o maior perímetro*/

public class retangulo {

    private double altura;
    private double largura;

    public retangulo(double altura, double largura) {
        setAltura(altura);
        setLagura(largura);
    }

    public double getAltura() {
        if (altura<=0){
            throw new IllegalArgumentException("numero invalido");
        }
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLagura() {
        if (largura<=0){
            throw new IllegalArgumentException("numero invalido");
        }
        return largura;
    }

    public void setLagura(double lagura) {
        this.largura = lagura;
    }


    public double calculoArea(){
       return  altura*largura;
    }
    public double calculoPerimetro(){
        return (altura+largura)*2;
    }

    @Override
    public String toString() {
        return "retangulo{" + "altura=" + altura + ", largura=" + largura + "}";
    }
}
