public class Pessoa implements Comparable {

    String nome;
    int idade;
    char escolha;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;

    }

    public int getIdade() {
        return idade;
    }


    public String getNome() {
        return nome;
    }


    void insert(String nome, int idade) {
       this.nome=nome;
        this.idade=getIdade();
    }


   @Override
    public int compareTo(Object o) {

        Pessoa x=(Pessoa)o;
     if(escolha=='i' || escolha=='I') {

        if (this.idade > x.getIdade()) {
            return 1;
        } else {
            if (this.idade < x.idade) {
                return -1;
            } else {
                return 0;
            }
        }
     }
     else{

        Pessoa temp= (Pessoa) o;
        // System.out.println(temp.getNome().compareTo(temp.getNome()));
        return getNome().compareTo(temp.getNome());

     }
    }
}
