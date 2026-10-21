/*(lista2-exer3)
Desenvolva um sistema para o controle de alunos de uma instituição de ensino.
Cada aluno deve possuir os seguintes atributos:
• nome
• idade
• matrícula
• curso
• média final
*/
public class aluno {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private Double media;

    public aluno(String nome, int idade, String matricula, String curso, Double media) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMedia(media);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            System.out.println("nome invalido");
        }
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("numero invalido");
        }
        this.idade = idade;
    }


    public String getMatricula() {

        return matricula;
    }
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()){
            System.out.println("matricula invalida");
        }
        this.matricula = matricula;
    }


    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        if(curso == null || curso.isBlank()){
            System.out.println("curso invalido");
        }
            this.curso = curso;
    }


    public Double getMedia() {
        return media;
    }
    public void setMedia(Double media) {
        if (media <= 0){
            System.out.println("media invalida");
        }
        this.media = media;
    }

    @Override
    public String toString() {
        return "sala{" + "nome='" + nome + '\'' + ", idade=" + idade + ", matricula=" + matricula + ", curso='" + curso + '\'' + ", media=" + media + '}';
    }
}
