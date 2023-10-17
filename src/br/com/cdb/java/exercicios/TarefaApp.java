package br.com.cdb.java.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> ListaDeTarefas = new ArrayList<>();

        System.out.println("Olá, seja muito bem vindo! " +
                "Digite o número da ação que deseja realizar:\n" +
                "1 - Adicionar tarefa \n"+
                "2 - Remover tarefa\n" +
                "3 - Listar tarefas\n" +
                "4 - Listar em ordem alfabética\n" +
                "5 - Listar em ordem cronológica");

        int opcaoDesejada = input.nextInt();

        switch (opcaoDesejada){
            case 1 :
                System.out.println("Digite o nome da tarefa");
                String novaTarefa = input.nextLine();
                ListaDeTarefas.add(novaTarefa);

                //for(String tarefa : ListaDeTarefas){
             //       System.out.println(tarefa);
             //   }
                break;
            case 2 :
                System.out.println("Você selecionou a opção 2.");
                break;
            case 3 :
                System.out.println("Você selecionou a opção 3.");
                break;
            case 4 :
                System.out.println("Você selecionou a opção 4.");
                break;
            case 5 :
                System.out.println("Você selecionou a opção 5.");
                break;
        }
    }
}
