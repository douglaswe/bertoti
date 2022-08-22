package antipattern;

class Carro{    

	String name = "Mercedes";  
}    

class Marca extends Carro{    
 int valor = 250000;     
 
 public static void main(String args[]){    
Marca s1 = new Marca();    
   
   System.out.println();    
   System.out.println("Marca Nome: " + s1.name);    
   System.out.println("Valor: " + s1.valor);    
}    
} 