/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Armazenavel com os métodos salvar() e carregar(), e implemente-a nas classes ArquivoTexto e BancoDeDados.
CLASSE: Main
 */
package Exe43;

public class Main {
    public static void main(String[] args) {
        IArmazenavel arquivotexto = new ArquivoTexto();
        IArmazenavel bancodedadeos = new BancoDeDados();

        
        arquivotexto.salvar();
        arquivotexto.carregar();

        bancodedadeos.salvar();
        bancodedadeos.carregar();
    }
}
