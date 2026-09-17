/*Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS,
PR e SC) e RENDA ANUAL.
EX:
Nome: João da Silva
CPF: 123.456.789-00
UF: PR
RendaAnual: R$40.000
Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
Renda Anual Alíquota
0 a 4.000 0%
4.001 a 9.000 5,8%
9.001 a 25.000 15%
25.001 a 35.000 27,5%
acima de 35.000 30%
Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota
Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
Calcule:
a) Quem mais paga imposto.
b) Qual o total de imposto pago entre os 5 contribuintes?*/
public class contribuinte {

    private String nome;
    private String CPF;
    private String UF;
    private double rendaAnual;
    double aliquota 

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
     if(nome == null || nome.isBlank()){
         System.out.println("erro,insira um nome");
     }else {
         this.nome = nome;
     }
    }


    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        if (CPF == null || CPF.isBlank() || CPF.length()!=11){
            System.out.println("erro,CPF invalido");
        }else {
            this.CPF = CPF;
        }
    }


    public String getUF() {
        return UF;
    }
    public void setUF(String UF) {
     if(UF == null || UF.isBlank()){
         System.out.println("erro,UF invalido");
     }
        this.UF = UF;
    }


    public double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    public double calculaImposto(){
        if(rendaAnual >=0 || rendaAnual <= 4000){
            aliquota = 0;
        } else if (rendaAnual >= 4001 || rendaAnual <= 9000) {
            aliquota = 0.058;
        } else if (rendaAnual >=9001 || rendaAnual <= 25000) {
            aliquota = 0.15;
        } else if (rendaAnual >=25001 || rendaAnual <= 35000) {
            aliquota = 0.27;
        }else {
            aliquota = 0.30;
        }
    return rendaAnual*aliquota;
    }

}
