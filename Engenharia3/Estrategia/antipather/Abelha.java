package antipattern;

public class Abelha extends Inseto{

	public Abelha(int tamanho, String cor) {
		super(tamanho, cor);
	}
	public void mover() {
		System.out.println("voar");
	}
	public void atacar() {
		mover();
		super.atacar();
	}
}
