package Lista04.abstratas;

import Lista04.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    protected double quantidadeComida;
    protected double caminhoPercorrido;
    protected double horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadeComida = 0.0;
        this.caminhoPercorrido = 0.0;
        this.horasDormidas = 0.0;
    }

    @Override
    public abstract void comer(double quantidadeComida);

    @Override
    public abstract void moverse(double caminhoPercorrido);

    @Override
    public abstract void dormir(double horasDormidas);
}
