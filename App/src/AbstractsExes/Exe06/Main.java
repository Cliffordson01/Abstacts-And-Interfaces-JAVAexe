
/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Adicione um construtor à classe Animal que aceite um nome e um método getNome()
CLASSE: Main
 */

package Exe06;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro("Bulldog");

        System.out.println("Nome do animal: " + animal.getNome());
         
          animal.fazerSom();
    }

    
}
