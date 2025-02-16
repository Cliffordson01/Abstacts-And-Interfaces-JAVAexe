/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma classe Produto com um método calcularDesconto(), e implemente Eletronico e Alimento.
CLASSE: Alimento
 */
package Exe27;

 class Alimento extends Produto {
    @Override
    public void calcularDesconto(){
        System.out.println(" O desconto sera de 30 reais a menos");
    }
}
