/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Estoque com um método atualizarQuantidade(), e implemente Eletronicos e Roupas
CLASSE: Main
 */
package Exe30;

public class Main {
    public static void main(String[] args) {
        Eletronicos eletronicos = new Eletronicos();
        Roupas roupas = new Roupas();
        
        eletronicos.atualizarQuantidade();
        roupas.atualizarQuantidade();
    }
}
