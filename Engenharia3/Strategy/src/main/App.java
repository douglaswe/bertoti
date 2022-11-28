package main;

public class App {

	public static void main(String[] args) {
		Animal coelho = new Animal(new Herbivoro());
		Animal lobo = new Animal(new Carnivoro());
		Animal porco = new Animal(new Onivoro());
		
		coelho.alimentar();
		lobo.alimentar();
		porco.alimentar();
	}

}