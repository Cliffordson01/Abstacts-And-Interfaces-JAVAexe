/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  .Crie uma interface Mensagem que retorna "Bem-vindo ao sistema!" e implemente-a na classe Usuario.
CLASSE: Main
 */
package Exe54;

public class Main {
    public static void main(String[] args) {
        IMensagem usuario = new Usuario();
        
        usuario.welcome();
    }
}
