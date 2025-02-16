/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface Autenticavel com os métodos login() e logout(), implemente-a nas classes UsuarioSistema e Administrador.
CLASSE: Main
 */
package Exe57;

public class Main {
    public static void main(String[] args) {
        IAutenticavel usuarioSistema = new UsuarioSistema();
        IAutenticavel administrador = new Administrador();
        
        usuarioSistema.login();
        usuarioSistema.logout();

        administrador.login();
        administrador.logout();
    }
}
