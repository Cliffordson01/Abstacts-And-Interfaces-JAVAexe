/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  .Crie uma interface Mensagem que retorna "Bem-vindo ao sistema!" e implemente-a na classe Usuario.
INTERFACE: IMensagem
 */
package Exe54;

public interface IMensagem {
    default void welcome(){
        System.out.println("\"Bem-vindo ao sistema!");
    }
    
} 