/*Classe Endereco:
Essa classe deve conter os atributos:
• UF
• Cidade
• CEP
• Logradouro
• Número da residência*/

public class classeEndereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String nomeResidencia;

    public classeEndereco(String uf, String nomeResidencia, String logradouro, String cep, String cidade) {
        setUf(uf);
        setNomeResidencia(nomeResidencia);
        setLogradouro(logradouro);
        setCep(cep);
        setCidade(cidade);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
       if (uf == null || uf.isBlank() || uf.length() != 2){
          throw new IllegalArgumentException("UF invalido");
       }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("cidade invalida");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank()){
            throw new IllegalArgumentException("CEP invalido");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
       if (logradouro == null || logradouro.isBlank()){
           throw new IllegalArgumentException("logradouro invalido");
       }
        this.logradouro = logradouro;
    }

    public String getNomeResidencia() {
        return nomeResidencia;
    }

    public void setNomeResidencia(String nomeResidencia) {
        if (nomeResidencia == null || nomeResidencia.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nomeResidencia = nomeResidencia;
    }

    @Override
    public String toString() {
        return "classeEndereco{" + "uf='" + uf + '\'' + ", cidade='" + cidade + '\'' + ", cep='" + cep + '\'' + ", logradouro='" + logradouro + '\'' + ", nomeResidencia='" + nomeResidencia + '\'' + '}';
    }
}
