/*Crie uma classe Funcionário que terá como atributos:
• Identificação
• Nome
• Sobrenome
• Salário (mensal)
Crie métodos para:
Obter o salário anual do funcionário
Obter o nome completo do funcionário
Modificar o salário. O parâmetro do método deve ser o percentual de aumento*/

public class funcionario {

        String identificacao;
        String nome;
        String sobrenome;
        double salario;

        public double calcularSalarioAnual(){
                return salario *12;
        }
        public String obterNomeCompleto(){
                return nome+" "+sobrenome;
        }
        public void modificaSalario(double percentualAumento){
                double aumento = salario * percentualAumento/100;
                double salarioFinal = salario + aumento;
                salario = salarioFinal;
        }
}
