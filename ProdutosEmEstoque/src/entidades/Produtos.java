package entidades;

public class Produtos {
    public String name;
    public double price;
    public int qnt;
    
    public double valorTotalEmEstoque(){
        return price * qnt;
    }
    
    public void addProd(int qnt){
        this.qnt += qnt;
    }
    
    public void remProd(int qnt){
        this.qnt -= qnt;
    }

    @Override
    public String toString(){
        return name + ", $" + String.format("%.2f", price) + ", " + qnt + " unidades, Total: $ " + String.format("%.2f", valorTotalEmEstoque()); 
        
    }
    
    

}
