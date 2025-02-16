/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e Designer.
CLASSE: Main
 */

package Exe28;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Designer designer = new Designer();

        desenvolvedor.baterPonto();
        designer.baterPonto();
    }
}
