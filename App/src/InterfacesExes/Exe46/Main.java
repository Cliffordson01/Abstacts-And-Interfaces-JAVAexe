/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Modifique a interface Animal adicionando um método default chamado dormir() que imprime"Zzz...", e implemente-a na classe Cachorro.
CLASSE: Main
 */
package Exe46;

public class Main {
    public static void main(String[] args) {
        IAnimal cachorro = new Cachorro();
        
        cachorro.dormir();
    }
}
