/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.
CLASSE: Cachorro
 */


package Exe05;

 class Cachorro extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("AU au AU au");
    }
}
