package model;

public class Mamifero extends Animal implements Nadador {


    public Mamifero(int ID, String nome, String especie, int peso, Alimentacao alimentacao, int numeroDePatas) {
        super(ID , nome, especie, peso, alimentacao, numeroDePatas);
    }

    @Override
    public void nadar(){

    }
}
