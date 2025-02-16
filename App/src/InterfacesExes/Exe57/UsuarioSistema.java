/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Autenticavel com os métodos login() e logout(), implemente-a nas classes UsuarioSistema e Administrador.
CLASSE: UsuarioSistema
 */
package Exe57;

 class UsuarioSistema implements IAutenticavel {
    @Override
    public void login(){
        System.out.println("usuariodositema@out.com");
    }
    public void logout(){
        System.out.println("Segure TAB para sair do sistema");
    }
}
