package model;

public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario( int ID, String nome, int idade, String cargo){
        super(ID, nome, idade);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
