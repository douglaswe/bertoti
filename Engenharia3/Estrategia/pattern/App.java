package pattern;

import antipattern.Abelha;
import antipattern.Inseto;

public class App {

	public static void main(String[] args) {
		Abelha a = new Abelha(1,"Vermelho", new Ataque("voar","mover"));
		a.atacar();
		
		Abelha b = new Abelha(2,"Preta",new Ataque("voar","mover"));
		b.atacar();
	}

}
