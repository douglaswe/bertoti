package main;

public class App {
	public static void main(String[] args) {
		Esquadrao esq1 = new Esquadrao();
		
		esq1.add(new Soldado("Robson","Bucha de Canh�o"));
		esq1.add(new Marinheiro("Geovaldo", "Marinheiro de �gua Doce"));
	}
}