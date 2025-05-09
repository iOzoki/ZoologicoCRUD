package model;

public abstract class Pessoa {
    int ID;
    private String nome;
    private int idade;

    public Pessoa(int ID, String nome, int idade) {
        this.ID = ID;
        this.nome = nome;
        this.idade = idade;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}

