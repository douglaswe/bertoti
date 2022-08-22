package patterns;

public class Composicao {  
    public static void main(String[] args) {  
Carro c1 = new Carro();  
        Part p = new Part();  
        c1.getData(p.getMarcaName());  
        }  
  }  