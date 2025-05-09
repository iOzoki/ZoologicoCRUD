package model;

public abstract class Animal {
    int ID;
    String especie;
    int peso;
    int numeroDePatas;
    String alimentacao;
    String ambiente;

    public Animal(int ID,String especie, int peso, String alimentacao, String ambiente, int numeroDePatas) {
        this.ID = ID;
        this.especie = especie;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.ambiente = ambiente;
        this.numeroDePatas = numeroDePatas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
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
