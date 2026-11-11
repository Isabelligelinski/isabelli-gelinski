/*(lista 2 - exer 5)
sacar
• Recebe como parâmetro: o valor a ser sacado
• Deve verificar se há saldo suficiente antes de realizar a operação
• Caso o saque seja possível, o saldo deve ser atualizado; caso contrário, exibir uma
mensagem apropriada

depositar
• Recebe como parâmetro: o valor a ser depositado
• Deve verificar se o valor a ser depositado é maior do que 0
• O valor deve ser somado ao saldo da conta

transferir
• Recebe como parâmetros: o objeto Conta que receberá o dinheiro e o valor a ser
transferido
• A transferência só deve ocorrer se houver saldo suficiente

simularInvestimento
• Recebe como parâmetros: o valor a ser investido e o tempo em meses do investimento
• O cálculo do montante final deve seguir a fórmula de juros compostos:
https://brasilescola.uol.com.br/matematica/juros-compostos.htm
• Ao final, o método deve retornar o valor do montante obtido
• Assuma que a taxa de juros é de 1% por mês*/


import java.util.ArrayList;
import java.util.List;

public class classeConta {
    private List<conta> contas;

    public classeConta() {
        contas = new ArrayList<>();
    }
    public void adicionarconta(conta c) {contas.add(c);}
}


