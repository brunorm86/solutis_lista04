package Lista04.concretas;


import Lista04.abstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, double altura, double peso) {
        super(nome, "Gato", idade, "Qualquer", altura, peso, 4);
    }

    @Override
    public void comer(double qntComida) {
        quantidadeComida += qntComida;
    }

    @Override
    public void moverse(double distancia) {
        caminhoPercorrido += distancia;
    }

    @Override
    public void dormir(double horasSono) {
        horasDormidas += horasSono;
    }
}