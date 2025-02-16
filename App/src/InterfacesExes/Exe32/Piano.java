/*
Autor: Cliffordson Cetoute
RA: 168475-2024
OBJETIVO:  Crie uma interface InstrumentoMusical com o método tocar() e implemente-a nas classes Violao e Piano
CLASSE: Piano
 */
package Exe32;

class Piano implements IInstrumentoMusical{
  @Override
  public void tocar(){
    System.out.println("O piano esta tocando");
  }  
}
