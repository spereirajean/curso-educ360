package br.com.cdb.java.exercicios;


import java.util.Scanner;

public class Tarefa {

    Scanner input = new Scanner(System.in);

    private String nomeTarefa;
    private int dataLimite;
    private String descricao;

    public String getNomeTarefa(){
        return nomeTarefa;
    }

    public void setNomeTarefa(){
        this.nomeTarefa = nomeTarefa;
    }

    public int getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(int dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}