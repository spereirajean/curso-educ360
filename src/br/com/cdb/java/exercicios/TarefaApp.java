package br.com.cdb.java.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

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
                    input = new Scanner(System.in);
                    System.out.println("Insira o nome da nova tarefa:");
                    String nome = input.nextLine();

                    boolean estaNaLista = false;
                    for (Tarefa tarefaLista : listaDeTarefas) {
                        if (tarefaLista.getNomeTarefa().equals(nome))
                            estaNaLista = true;
                        }
                        if (estaNaLista) {
                            System.out.println("Esta tarefa já existe.");
                        } else {
                            System.out.println("Crie uma descrição para esta tarefa:");
                            String descricao = input.nextLine();
                            System.out.println("Defina o prazo para a realização desta tarefa: (dd/mm/aaaa)");
                            String prazo = input.nextLine();
                            System.out.println("Tarefa adicionada com sucesso!");

                            Tarefa tarefa = new Tarefa();
                            tarefa.setNomeTarefa(nome);
                            tarefa.setDescricao(descricao);
                            tarefa.setDataLimite(prazo);

                            listaDeTarefas.add(tarefa);
                        }
                        break;
                        case 2:
                            System.out.println("Você selecionou a opção 2.");
                            break;
                        case 3:
                            for (Tarefa tarefa1 : listaDeTarefas) {
                                System.out.println(tarefa1.getNomeTarefa() + "-" + tarefa1.getDescricao() + "- " + tarefa1.getDataLimite());
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
    }
