package model;
//Classe abstrata principal para todos seres que são animais herdarem a classe Animal

public abstract class Animal {
    int ID;
    String nome;
    String especie;
    int peso;
    int numeroDePatas;
    Alimentacao alimentacao;

    public Animal(int ID, String nome, String especie, int peso, Alimentacao alimentacao, int numeroDePatas) {
        if(this.peso < 0 || this.numeroDePatas < 0) {
            throw new IllegalArgumentException("Peso ou número de patas inválido!");
        }
        else{
        this.ID = ID;
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.numeroDePatas = numeroDePatas;
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

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
