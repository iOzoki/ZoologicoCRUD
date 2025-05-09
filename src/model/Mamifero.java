package model;

public class Mamifero extends Animal implements Nadador {


    public Mamifero(int ID, String nome, String especie, int peso, String alimentacao, String ambiente, int numeroDePatas) {
        super(ID , nome, especie, peso, alimentacao, ambiente, numeroDePatas);
    }

    @Override
    public void nadar(){

    }
}
