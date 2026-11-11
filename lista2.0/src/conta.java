/*(lista 2 - exer 5)
Implemente uma classe chamada Conta, que represente uma conta bancária. Essa classe
deve possuir os seguintes atributos:
• nomeTitular: nome do dono da conta
• saldo: valor atual disponível na conta
*/

public class conta {

    private String nomeTitular;
    private double saldo;

    public conta(String nomeTitular, double saldo) {

        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
       if(saldo < 0){
           System.out.println("invalido");
       }
        this.saldo = saldo;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()){
           throw new IllegalArgumentException("nome invalido");
        }
        this.nomeTitular = nomeTitular;
    }
    public void sacarValor (double saque){
        if (saque <= 0 || saque > saldo){
            throw new IllegalArgumentException("valor invalido");
        }
        saldo -= saque;
    }

    public void depositarValor(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("valor invalido");
        }
        saldo += deposito;
    }

    public void transferirValor(double v,conta contaDestino){
        if (v<=0 || contaDestino == null || v > saldo){
            throw new IllegalArgumentException("valor invalido");
        }
        saldo -= v;
        contaDestino.depositarValor(v);
    }

    public double simularInvestimento(double valorInvestido, int tempo){
        if (tempo <= 0 || valorInvestido <= 0){
            throw new IllegalArgumentException("tempo ou valor invalido");
        }
        return valorInvestido+Math.pow(1.01, tempo);
    }
    
    @Override
    public String toString() {
        return "conta{" + "nomeTitular='" + nomeTitular + '\'' + ", saldo=" + saldo + '}';
    }
}

