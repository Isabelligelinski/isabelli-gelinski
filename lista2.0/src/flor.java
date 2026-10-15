/*(lista2-exer2)
Em um sistema de gerenciamento de uma floricultura, é necessário armazenar informações
sobre as flores vendidas. Para cada venda de flor, devem ser registrados os seguintes dados:
• Nome da flor
• Preço da flor
• Nome do cliente que realizou a compra
Com base nesse cenário, implemente um método que receba como parâmetro o nome de um
cliente e retorne uma lista contendo todas as flores compradas por esse cliente*/

public class flor {

    private String cliente;
    private double precoflor;
    private String nomeflor;

    public flor(String cliente, String nomeflor, double precoflor) {
        setCliente(cliente);
        setNomeflor(nomeflor);
        setPrecoflor(precoflor);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank()){
            throw new IllegalArgumentException("nome do cliente invalido");
        }
        this.cliente = cliente;
    }

    public String getNomeflor() {
        return nomeflor;
    }

    public void setNomeflor(String nomeflor) {
        if (nomeflor == null || nomeflor.isBlank()){
            throw new IllegalArgumentException("flor invalida");
        }
        this.nomeflor = nomeflor;
    }

    public double getPrecoflor() {
        return precoflor;
    }

    public void setPrecoflor(double precoflor) {
        this.precoflor = precoflor;
    }

    @Override
    public String toString() {
        return "flor{" + "cliente='" + cliente + '\'' + ", precoflor=" + precoflor + ", nomeflor='" + nomeflor + '\'' + '}';
    }
}
