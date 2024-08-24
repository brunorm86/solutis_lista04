package Lista04.concretas;

import Lista04.abstratas.AnimalMarinhoAB;

public class Tubarao extends AnimalMarinhoAB {

        public Tubarao(String nome, int idade, double altura, double peso) {
            super(nome, "Tubarão", idade, "Marinho", altura, peso);
        }

        @Override
        public void nadar(double caminhoPercorrido) {
            this.caminhoPercorrido+=caminhoPercorrido;
        }

    @Override
    public void comer(double quantidadeComida) {
this.quantidadeComida+=quantidadeComida;
    }

    @Override
    public void moverse(double caminhoPercorrido) {
        nadar(caminhoPercorrido);
    }

    @Override
    public void dormir(double horasDormidas) {
this.horasDormidas+=horasDormidas;
    }
}


