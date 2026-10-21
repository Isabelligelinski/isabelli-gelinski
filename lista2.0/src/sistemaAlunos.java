//(lista2_exer3)

import java.util.ArrayList;
import java.util.List;

/*Na classe SistemaAlunos
• Retornar todos os alunos de um determinado curso que possuam idade maior ou igual
a um valor X e média final maior ou igual a um valor Y.
• Buscar e retornar um aluno a partir de sua matrícula, considerando que cada matrícula
é única no sistema.
• Desafio: permitir o cadastro de um novo aluno somente se o e-mail informado ainda
não estiver cadastrado no sistema. Caso já exista um aluno com o mesmo e-mail,
deverá ser lançada uma exceção*/
public class sistemaAlunos {

private List<aluno>alunos;

public sistemaAlunos(){
    alunos = new ArrayList<aluno>();
}
public void adicionaAlunos(aluno a){
    alunos.add(a);
}
public List <aluno>buscarAlunoPorCursoIdadeMedia(String curso,int idade,double media){
    List<aluno> alunoPesquisa = new ArrayList<aluno>();
    for (aluno a : alunos){
        if (a.getCurso().equals(curso) && a.getIdade()>=idade && a.getMedia() > media){
            alunoPesquisa.add(a);
        }
    }
    return alunos;
}
public aluno buscarAlunoPorMatricula(String matricula){
    for (aluno a : alunos){
        if (a.getMatricula().equals(matricula)){
            return a;
        }
    }
    return null;
}
}
