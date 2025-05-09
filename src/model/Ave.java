package model;

public class Ave extends Animal implements Voador{


    public Ave(int ID, String nome, String especie, int peso, String alimentacao, String ambiente, int numeroDePatas) {
        super(ID , nome, especie, peso, alimentacao, ambiente, numeroDePatas);
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
