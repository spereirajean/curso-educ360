package br.com.cdb.java.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> ListaDeTarefas = new ArrayList<>();

        int condicao = 0;
        while (condicao != 6) {
            System.out.println("Olá, seja muito bem vindo! " +
                    "Digite o número da ação que deseja realizar:\n" +
                    "1 - Adicionar tarefa \n" +
                    "2 - Remover tarefa\n" +
                    "3 - Listar tarefas\n" +
                    "4 - Listar em ordem alfabética\n" +
                    "5 - Listar em ordem cronológica\n" +
                    "6 - Sair");
            condicao = input.nextInt();
            switch (condicao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    System.out.println("Você selecionou a opção 2.");
                    break;
                case 3:
                    System.out.println("Você selecionou a opção 3.");
                    break;
                case 4:
                    System.out.println("Você selecionou a opção 4.");
                    break;
                case 5:
                    System.out.println("Você selecionou a opção 5.");
                    break;

            }
        }
    }
    private static void adicionarTarefa() {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome da nova tarefa:");
        String nome = input.nextLine();
        System.out.println("Crie uma descrição para esta tarefa:");
        String descricao = input.nextLine();
        System.out.println("Defina o prazo para a realização desta tarefa: (dd/mm/aaaa)");
        String prazo = input.nextLine();
        System.out.println("Tarefa adicionada com sucesso!");
    }
}
