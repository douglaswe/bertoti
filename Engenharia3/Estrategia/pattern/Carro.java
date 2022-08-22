package patterns;

class Carro  
{  
    String marca;  
    public void getData(String nome)  
    {  
        marca = nome;
        System.out.println("Carro: " +marca);  
    }  
}  
class Part  
{  
    public String getMarcaName()  
    {  
            return "Mercedes";              
}  
}  
