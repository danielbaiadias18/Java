package entidades;

public class Funcionario {
    
    public String name;
    public double salGross;
    public double tax;
    
    public double NetSal(){
        return salGross - tax;
    } 
   
    public void IncreaseSal(double perc){
        salGross = salGross +(salGross / 100 * perc);
    }
    
}
