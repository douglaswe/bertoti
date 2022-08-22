package pattern;

public class Ataque implements Atacar {
	private String mover;
	private String atacar;
	
	public Ataque(String mover,String atacar) {
		this.mover = mover;
		this.atacar = atacar;
	}
	
	@Override
	public void mover() {
		System.out.println(mover);
		
	}
	@Override
	public void atacar() {
		mover();
		System.out.println(atacar);
		
	}

}
