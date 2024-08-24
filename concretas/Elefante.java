package Lista04.concretas;

import Lista04.abstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Elefante", idade, "Savanas africanas", altura, peso, 4);
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
