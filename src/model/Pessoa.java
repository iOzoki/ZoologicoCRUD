package model;

public abstract class Pessoa {
    int ID;
    private String nome;
    private int idade;

    public Pessoa(int ID, String nome, int idade) {
        if(this.idade < 0 || idade > 110) {
            throw new IllegalArgumentException("Idade inválida");
        }
        else {
            this.ID = ID;
            this.nome = nome;
            this.idade = idade;
        }
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

