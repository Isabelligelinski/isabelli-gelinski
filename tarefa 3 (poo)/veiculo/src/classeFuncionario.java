public class classeFuncionario {
    public static void main(String[] args) {
        funcionario info = new funcionario();

        info.identificacao="1234";
        info.nome = "isa";
        info.sobrenome = "barberini";
        info.salario = 1600;

        System.out.println(info.calcularSalarioAnual());
        System.out.println(info.obterNomeCompleto());
        info.modificaSalario(10);


    }
}
