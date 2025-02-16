/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface InstrumentoMusical com o método tocar() e implemente-a nas classes Violao e Piano
CLASSE: Main
 */
package Exe32;

public class Main {
    public static void main(String[] args) {
        IInstrumentoMusical piano = new Piano();
        IInstrumentoMusical violao = new Violao();

        piano.tocar();
        violao.tocar();
        
    }
}
