package model;

public class Funcionario extends Pessoa{
    private Cargo cargo;

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

}
