/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Adicione um construtor à classe Animal que aceite um nome e um método getNome()
CLASSE ABSTRATA: Animal
 */

package Exe06;

abstract class Animal {
    // Atributo da classe
    private String nome;

    // Construtor da classe, que aceita um nome
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método getNome() que retorna o nome do animal
    public String getNome() {
        return nome;
    }

    // Método abstrato que pode ser implementado pelas subclasses
    public abstract void fazerSom();
}