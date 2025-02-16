/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Produto com um método calcularDesconto(), e implemente Eletronico e Alimento.
CLASSE: Main
 */

package Exe27;

public class Main {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico();
        Alimento alimento = new Alimento();

        eletronico.calcularDesconto();
        alimento.calcularDesconto();
    }
}
