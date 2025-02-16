/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Imprimivel adicionando um método default chamado
mostrarNoMonitor(), que imprime "Exibindo no monitor", e implemente-a na classe Documento.
CLASSE: Main
 */
package Exe47;

public class Main {
    public static void main(String[] args) {
        IImprimivel documento = new Documento();
        
        documento.mostrarNoMonitor();
    }
}
