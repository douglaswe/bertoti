package pattern;

 class Abelha extends Inseto implements Atacar {
	private Atacar atacar;
	public Abelha(int tamanho, String cor,Atacar atacar) {
		super(tamanho, cor);
		this.atacar = atacar;
	}

		public void mover() {
			atacar.mover();
		}
		public void atacar() {
			atacar.atacar();
		}

	}

