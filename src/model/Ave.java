package model;

public class Ave extends Animal implements Voador{


    public Ave(int ID, String nome, String especie, int peso, Alimentacao alimentacao, int numeroDePatas) {
        super(ID , nome, especie, peso, alimentacao, numeroDePatas);
    }

    @Override
    public void voar(){
        System.out.println("Voando");
    }

    @Override
    public boolean estaVoando(){
        return true;
    }
}
