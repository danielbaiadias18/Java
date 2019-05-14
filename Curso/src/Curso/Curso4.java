package Curso;



import java.util.Locale;
import java.util.Scanner;

public class Curso4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        float sal, imp;

        System.out.println("Digite o salario: ");
        sal = sc.nextFloat();

        if (sal < 2000)
        {
            System.out.println("Isento do Imposto de Renda.");    
        } 
        else if (sal > 2000 && sal <= 3000) 
        {      
            imp = (float) ((sal-2000) * 0.08);
            System.out.println("Imposto pago: " + imp);           
        } 
        else if (sal > 3000 && sal <= 4500) 
        {      
            imp = (float)(1000 * 0.08) + (float)((sal-3000)*0.18);
            System.out.println("Imposto pago: " + imp);
        }
        else if (sal > 4500)
        {
            imp = (float)(1000 * 0.08) + (float)(1500*0.18) + (float)((sal-4500)*0.28);
            System.out.println("Imposto pago: " + imp);
        }
        sc.close();

     
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    
        int x1 = 0, y1 = 0, z1 = 0;
        System.out.println("Digite 3 números a ser avaliados: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        z1 = sc.nextInt();

        if (x1 >= y1 && x1 >= z1) {
            System.out.println(x);
        } else if (y1 >= x1 && y1 >= z1) {
            System.out.println(y);
        } else if (z1 > x1 && z1 > y1) {
            System.out.println(z1);
        }
        sc.close();
    
    
        int x2 = 0, y2 = 0, z2 = 0;
        System.out.println("Digite 3 números a ser avaliados: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        z2 = sc.nextInt();

        if (x2 >= y2 && x2 >= z2) {
            if (x2 != y2 && x2 != z2) 
                {
                System.out.println("X é o maior número.");
                } else if (x2 == y2) 
                {
                System.out.println("X e Y são os maiores.");
                } else if (x2 == z2) 
                {
                System.out.println("X e Z são os maiores");
                }
        } else if (y2 >= x2 && y2 >= z2) 
        {
            if (y2 != x2 && y2 != z2) 
                   {
                System.out.println("Y é o maior número.");
                } else if (y2 == x2) 
                {
                System.out.println("Y e X são os maiores.");
                } else if (y2 == z2) 
                {   
                System.out.println("Y e Z são os maiores");
                }
        } else if (z2 > x2 && z2 > y2) 
        {
            if (z2 != y2 && z2 != x2) 
                {
                System.out.println("Z é o maior número.");
                } else if (x2 == z2) 
                {
                System.out.println("Z e X são os maiores.");
                } else if (y2 == z2) 
                {
                System.out.println("Z e Y são os maiores");
                }
        }
    
    
        if(x%2==0){
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
        

    
        int x3 = 0;

        System.out.println("Digite um número: ");
        x3 = sc.nextInt();

        if (x3 >= 0 && x3 <= 25) {
            System.out.println("Número entre 0 e 25.");
        } else if (x3 > 25 && x3 <= 50) {
            System.out.println("Número entre 25 e 50.");
        } else if (x3 > 50 && x3 <= 75) {
            System.out.println("Número entre 50 e 75.");
        } else if (x3 > 75 && x3 <= 100) {
            System.out.println("Número entre 75 e 100.");
        } else {
            System.out.println("Fora de intervalo.");
        }

    
            int a4 = 10;
            boolean c1 = a4 < 10;
            boolean c2 = a4 < 20;
            boolean c3 = a4 > 10;
            boolean c4 = a4 > 5;
            
            System.out.println(c1+" "+c2+" "+c3+" "+c4);
            
            boolean c5 = a4 <= 10;
            boolean c6 = a4 >= 10;
            boolean c7 = a4 == 10;
            boolean c8 = a4 != 10;
            
            System.out.println(c5+" "+c6+" "+c7+" "+c8);
    }}
