package br.com.cdb.java.exercicios;

public class Tarefa {

    private String nomeTarefa;
    private String dataLimite;
    private String descricao;

    public String getNomeTarefa(){
        return nomeTarefa;
    }

    public void setNomeTarefa(String nome){
        this.nomeTarefa = nome;
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