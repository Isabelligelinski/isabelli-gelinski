/* (lista 2 - exer 4)
Crie um sistema para uma loja de materiais de construção
Os produtos terão os atributos: Marca, modelo, preço e quantidade em estoque

Na classe produto crie métodos para:
Adicionar mais unidades do produto ao estoque
Vender um produto, podendo ser vendido até a mesma quantidade que tem no estoque

Na classe materiais de construção crie métodos para obter:
• O produto mais caro de uma determinada marca
• Todos os produtos de uma determinada marca cujo preço esteja entre um intervalo de X
e Y */

public class lojaM {
    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public lojaM(String marca, String modelo, double preco, int quantidade) {
       setMarca(marca);
       setModelo(modelo);
       setPreco(preco);
       setQuantidade(quantidade);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            System.out.println("marca invalida");
        }
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
    if (modelo == null || modelo.isBlank()){
        System.out.println("modelo invalido");
    }
        this.modelo = modelo;
    }


    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
       if (preco <= 0){
           System.out.println("preco invalido");
       }
        this.preco = preco;
    }


    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
     if (quantidade <=0){
         System.out.println("quantidade invalida");
     }
        this.quantidade = quantidade;
    }

    public void addproduto(int addestoque){
        if (addestoque <=0){
            throw new IllegalArgumentException("adicao invalida");
        }
        quantidade = quantidade + addestoque;
    }

    public void venderP(int vender){
        if (vender>quantidade){
            throw new IllegalArgumentException("estoque limitado");
        }
        quantidade = quantidade - vender;
    }
    @Override
    public String toString() {
        return "materiaisC{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
}
