import java.time.LocalDate;
import java.time.Period;

public class dataexemplo1 {

    private LocalDate dataNascimento;

    public void setDataNascimento(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
    }
    
    public boolean determinarMaiorIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears() >= 18;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() { return "dataexemplo1{" + "dataNascimento=" + dataNascimento + '}';
    }
}