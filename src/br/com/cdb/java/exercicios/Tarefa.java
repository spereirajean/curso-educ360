package br.com.cdb.java.exercicios;


import java.util.Scanner;

public class Tarefa {

    Scanner input = new Scanner(System.in);

    private String nomeTarefa;
    private String dataLimite;
    private String descricao;

    public String getNomeTarefa(){
        return nomeTarefa;
    }

    public void setNomeTarefa(String nome1){
        this.nomeTarefa = nomeTarefa;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}