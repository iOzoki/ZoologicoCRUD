package model;

public class Mamifero extends Animal implements Nadador {


    public Mamifero(String especie, int peso, String alimentacao, String ambiente, int numeroDePatas) {
        super(especie, peso, alimentacao, ambiente, numeroDePatas);
    }
}
