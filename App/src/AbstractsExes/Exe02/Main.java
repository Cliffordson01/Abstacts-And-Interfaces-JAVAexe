/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO: Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano
CLASSE: Main
 */

package Exe02;



    public class Main{
        public static void main(String[] args) {
            InstrumentoMusical guitarra = new Guitarra();
            InstrumentoMusical piano = new Piano();
    
    
            guitarra.tocar();
            piano.tocar();
    }
    }
