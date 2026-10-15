import java.util.ArrayList;
import java.util.List;

//(lista2-exer2)
public class florclasse {
    private List<flor> flores;
    public florclasse(){
        flores = new ArrayList<>();
    }
    public void adcionarFlores(flor f){
        flores.add(f);
    }
    public List<flor>pesquisaflor(String cliente){
        List<flor> florespesquisa = new ArrayList<flor>();
        for (flor f : flores){
            if (f.getCliente().equals(cliente)){
                florespesquisa.add(f);
            }
        }
        return florespesquisa;
    }
}
