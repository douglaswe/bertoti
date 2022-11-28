package main;

import calc.Calculadora;

public class App {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double resultado = 0;
		
		resultado = calculadora.soma(20, 5);
		System.out.println(resultado);
		
		resultado = calculadora.sub(5, 3.4);
		System.out.println(resultado);
		
		resultado = calculadora.mult(2, 8);
		System.out.println(resultado);
		
		resultado = calculadora.div(2, 8);
		System.out.println(resultado);
	}
}