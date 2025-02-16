/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Autenticavel com os métodos login() e logout(), implemente-a nas classes UsuarioSistema e Administrador.
CLASSE: Administrador
 */
package Exe57;

 class Administrador implements IAutenticavel {
    @Override
    public void login(){
        System.out.println("administradoroficial@out.com");
    }
    public void logout(){
        System.out.println("Aperte ESC para sair do sistema");
    }
}
