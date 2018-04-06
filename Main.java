package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    VetorDePessoas aVetor= new VetorDePessoas();

        Scanner entrada= new Scanner(System.in);
        System.out.println("Bem vindo ao cadastrador");;

        int op=0;

        do {
            String tempn;
            int tempi;

            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1 para cadastrar 2 para ordenar 3 para mostrar a lista 0 para sair");
            op=entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite um nome: ");
                    tempn = entrada.nextLine();

                    System.out.println("Digite a idade: ");
                    tempi = entrada.nextInt();

                entrada.nextLine();
                aVetor.inserta(tempn, tempi);
                break;
                case 2:
                    System.out.println("Ordenar por nome ou idade?(n ou i)");
                    char deseja = entrada.next().charAt(0);
                    aVetor.organiza(deseja);
                break;
                case 3:
                    aVetor.printa();

                    break;
            }
        }while (op!=0);
    }
}
