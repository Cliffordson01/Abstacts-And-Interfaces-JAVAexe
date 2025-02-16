/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Repositorio<T> com os métodos salvar(T objeto) e buscar(int id), implemente-a na classe RepositorioCliente.
CLASSE: RepositorioCliente
 */
package Exe59;

 class RepositorioCliente implements IRepositorio {
    @Override
    public void salvar(){
        System.out.println("Objeto Salvo");
    }
    public void buscar(){
        System.out.println("Buscar pelo ID do Objeto");
    }
}
