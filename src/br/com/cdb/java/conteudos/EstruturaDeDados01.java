package br.com.cdb.java.conteudos;

import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaDeDados01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> notaAlunos = new ArrayList<>();

        notaAlunos.add(78);
        notaAlunos.add(75);
        notaAlunos.add(80);
        notaAlunos.add(97);
        notaAlunos.add(64);
        notaAlunos.add(88);

        for(Integer nota : notaAlunos){
            System.out.println(nota);
        }
    }
}
