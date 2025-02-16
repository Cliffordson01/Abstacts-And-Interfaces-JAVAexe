/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano
CLASSE: Guitarra
 */

package Exe02;

class Guitarra extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Guitarra tocando");
    }
}