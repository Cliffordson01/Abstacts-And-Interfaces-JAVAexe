/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Repositorio<T> com os métodos salvar(T objeto) e buscar(int id), implemente-a na classe RepositorioCliente.
CLASSE: Main
 */
package Exe59;

public class Main {
    public static void main(String[] args) {
        IRepositorio repositorioCliente = new RepositorioCliente();

        repositorioCliente.salvar();
        repositorioCliente.buscar();
    }
}
