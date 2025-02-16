/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e Designer.
CLASSE: Desenvolvedor
 */

package Exe28;

 class Desenvolvedor extends Funcionario {
    @Override
    public void baterPonto(){
        System.out.println("Horario do DEVs e as 19 hrs");
    }
}
