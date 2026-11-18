import java.time.LocalDate;
import java.time.Period;

public class dataexemplo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate dataNascimentohenrique = LocalDate.of(2001,10,11);
        LocalDate dataNascimentoDiogo = LocalDate.of(2003,04,02);
                if(dataNascimentoDiogo.isAfter(dataNascimentohenrique)){
                    System.out.println("diogo é ,mais novo");
                }else {
                    System.out.println("henrique é mais novo");
                }

                int idadediogo = Period.between(dataNascimentoDiogo,hoje).getYears();

    }
}
