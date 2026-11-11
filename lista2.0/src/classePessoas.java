/*O objetivo deste exercício é implementar a relação entre uma pessoa e seu endereço.
Classe Pessoa:
Essa classe deve conter os atributos:
• Nome
• Endereco (classe Endereco)

Instancie objetos de Pessoa
*/
public class classePessoas {

    private String nome;
    private classeEndereco endereco;

    public classePessoas(String nome, classeEndereco endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("pessoa invalida");
        }
        this.nome = nome;
    }

    public classeEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(classeEndereco endereco) {
       if (endereco == null){
           throw new IllegalArgumentException("endereco invalido");
       }
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "classePessoas{" + "nome='" + nome + '\'' + ", endereco=" + endereco + '}';
    }
}

