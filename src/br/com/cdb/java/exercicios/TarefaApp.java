package br.com.cdb.java.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                    removerTarefa();
                    break;
                case 3:
                    for (Tarefa tarefa1 : listaDeTarefas) {
                        System.out.println(tarefa1.getNomeTarefa() + " - " + tarefa1.getDescricao() + " - " + tarefa1.getDataLimite());
                    }
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
    public static void adicionarTarefa() {
        Tarefa tarefa = new Tarefa();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome da nova tarefa:");
        String nome = entrada.nextLine();

        boolean estaNaLista = false;
        for (Tarefa listarTarefa : listaDeTarefas) {
            if (listarTarefa.getNomeTarefa().equals(nome)){
                estaNaLista = true;
            }
        }
        if (estaNaLista) {
            System.out.println("Esta tarefa já existe.");
        } else {
            System.out.println("Crie uma descrição para esta tarefa:");
            String descricao = entrada.nextLine();
            System.out.println("Defina o prazo para a realização desta tarefa: (dd/mm/aaaa)");
            String prazo = entrada.nextLine();
            System.out.println("Tarefa adicionada com sucesso!");

            tarefa.setNomeTarefa(nome);
            tarefa.setDescricao(descricao);
            tarefa.setDataLimite(prazo);

            listaDeTarefas.add(tarefa);

        }
    }
    public static void removerTarefa(){
        Scanner itemRemov = new Scanner(System.in);
        System.out.println("Digite o nome da tarefa que deseja remover.");
        String tarefaParaRemover = itemRemov.nextLine();
        for(Tarefa remove : listaDeTarefas){
            if (remove.getNomeTarefa().equals(tarefaParaRemover)){
                listaDeTarefas.remove(tarefaParaRemover);
            }
        }
    }
}
