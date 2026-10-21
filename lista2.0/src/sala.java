//(lista2-exer3)
public class sala {
    public static void main(String[] args) {
        aluno a1 = new aluno("joão",23,"12345678","engenheiro de software",9.0);
        aluno a2 = new aluno("lucas",22,"87654321","ciencias da computacao",8.0);
        aluno a3 = new aluno("isabelli",19,"24681012","desenvol.sistemas",10.0);
        aluno a4 = new aluno("gabriel",19,"135791315","fisica",7.0);
        aluno a5 = new aluno("sofia",17,"124578101","administracao",6.0);

        sistemaAlunos escola = new sistemaAlunos();

        escola.adicionaAlunos(a1);
        escola.adicionaAlunos(a2);
        escola.adicionaAlunos(a3);
        escola.adicionaAlunos(a4);
        escola.adicionaAlunos(a5);

        System.out.println(escola.buscarAlunoPorCursoIdadeMedia("engenharia de software",23,9.0));
        System.out.println(escola.buscarAlunoPorMatricula("12345678"));
    }
}
