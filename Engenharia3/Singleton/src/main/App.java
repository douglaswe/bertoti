package main;

public class App {
	public static void main(String[] args) {
		Singleton first = Singleton.getInstance("Hello World!");
		first.show();
		
		Singleton second = Singleton.getInstance("zZzZz");
		second.show();
	}
}