
public class Main {

    public static void main(String[] args) {

    VetorDePessoas aVetor= new VetorDePessoas();

    aVetor.inserta("Primeiro ",28);
    aVetor.inserta("Segundo ",12);
    aVetor.inserta("Terceiro ",43);
    aVetor.inserta("Quarto ",6);


    aVetor.printa();

        System.out.println("");

    aVetor.organiza('i');
    aVetor.printa();
        System.out.println("");
    aVetor.organiza('n');
    aVetor.printa();

    }
}
