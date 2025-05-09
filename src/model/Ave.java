package model;

public class Ave extends Animal implements Voador{
    private boolean podeVoar;


    public Ave(int ID, String nome, String especie, int peso, Alimentacao alimentacao, int numeroDePatas, boolean podeVoar) {
        super(ID , nome, especie, peso, alimentacao, numeroDePatas);
        this.podeVoar = podeVoar;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    @Override
    public void voar(){
        if(podeVoar) {
            System.out.println(nome + " da especie: "+ especie +", está voando");
        }
    }

}
