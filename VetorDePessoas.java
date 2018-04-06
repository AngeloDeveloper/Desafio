
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VetorDePessoas {

    List pessoas= new ArrayList<Pessoa>();

    public void organiza(char i){

        for (int j = 0; j < pessoas.size(); j++) {
            ((Pessoa)pessoas.get(j)).escolha=i;
        }
        Collections.sort(pessoas);
    }

    public void inserta(String nome, int idade){
        pessoas.add(new Pessoa(nome,idade));
    }

    public void printa(){
        for (int i = 0; i <pessoas.size() ; i++) {
            Pessoa temp=(Pessoa)pessoas.get(i);
            System.out.println("Nome: "+temp.getNome()+" Idade: "+temp.getIdade());
        }
    }
}
