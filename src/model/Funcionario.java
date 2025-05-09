package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    private Cargo cargo;
    private List<Animal> animaisSobCuidado = new ArrayList<Animal>();

    public Funcionario( int ID, String nome, int idade, Cargo cargo){
        super(ID, nome, idade);
        this.cargo = cargo;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public List<Animal> getAnimaisSobCuidado() {
        return animaisSobCuidado;
    }
    public void addAnimal(Animal animal){
        this.animaisSobCuidado.add(animal);
    }

}
