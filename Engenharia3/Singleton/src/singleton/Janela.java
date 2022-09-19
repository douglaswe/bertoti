package singleton;

public class Janela {
private static final Janela INSTANCE = new Janela();
private static final String	Teste = "Isso e Singleton";


public static final String Singleton = "teste" ; 

private Janela() {
	
}
public static Janela getInstance() {
	return INSTANCE;
}

public static void Abrir() {
	System.out.println("abriu a janela...");
}

public static void Fechar() {
	System.out.println("fechou a janela...");
}

}
