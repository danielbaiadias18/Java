package salariofunc;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class SalarioFunc {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Entre com os dados do funcionario: ");
        System.out.println("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Salario:");
        funcionario.salGross = sc.nextDouble();
        System.out.println("Taxa:");
        funcionario.tax = sc.nextDouble();
        
        System.out.println();

        
        System.out.print("Dados do funcionario: ");
        System.out.println(funcionario.name + ", $ " + String.format("%.2f",funcionario.NetSal()));
        
        System.out.println();
        
        System.out.println("Porcentagem a aumentar do salario: ");
        funcionario.IncreaseSal(sc.nextDouble());
        
        System.out.println();
        
        System.out.print("Dados atualizados do funcionario: ");
        System.out.println(funcionario.name + ", $ " + String.format("%.2f",funcionario.NetSal()));
        
        
    }
    
}
