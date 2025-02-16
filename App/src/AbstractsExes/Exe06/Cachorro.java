/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Adicione um construtor à classe Animal que aceite um nome e um método getNome()
CLASSE: Cachorro
 */

package Exe06;

 class Cachorro extends Animal {
    public Cachorro(String nome){
        super (nome);
    }
    
    @Override
    public void fazerSom(){
        System.out.println("AU au AU au");
    }
}
