package Lista04.concretas;

import Lista04.abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, double altura, double peso) {
        super(nome, "Cachorro", idade, "Todos", altura, peso, 4);
    }

    @Override
    public void comer(double qntComida) {
        this.quantidadeComida += qntComida;
    }

    @Override
    public void moverse(double distancia) {
        this.caminhoPercorrido += distancia;
    }

    @Override
    public void dormir(double horasSono) {
        this.horasDormidas += horasSono;
    }

}