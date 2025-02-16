/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.
CLASSE: Gato
 */
package Exe05;

 class Gato extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("MIAU miau MIAU miau");
    }
}
