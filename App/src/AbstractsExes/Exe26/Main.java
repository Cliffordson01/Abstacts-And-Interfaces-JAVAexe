/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Trabalho com um método executar(), e implemente Professor e Engenheiro
CLASSE: Main
 */

package Exe26;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Engenheiro engenheiro = new Engenheiro();

        professor.executar();
        engenheiro.executar();
    }
}
