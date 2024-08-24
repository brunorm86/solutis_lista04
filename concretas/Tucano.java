package Lista04.concretas;

import Lista04.abstratas.AnimalVoadorAB;

public class Tucano extends AnimalVoadorAB {

    public Tucano(String nome, int idade, double altura, double peso, double envergaduraAssa) {
        super(nome, "Tucano", idade, "Florestas tropicais", altura, peso, 2, envergaduraAssa);
    }


    @Override
    public void voar(double caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    @Override
    public void comer(double quantidadeComida) {
this.quantidadeComida += quantidadeComida;
    }

    @Override
    public void moverse(double caminhoPercorrido) {
        voar(caminhoPercorrido);
    }

    @Override
    public void dormir(double horasDormidas) {
        this.horasDormidas += horasDormidas;
    }
}