package Curso;

import java.util.Scanner;

public class Curso8Funcoes {
    
    public static int max(int a, int b, int c){
        int maior;
        if(a>b && a>c){
            maior = a;
        }else if(b>c){
            maior = b;
        }else{
            maior = c;
        }
        
    return maior;
    }
    
    public static void resultado(int x){
        System.out.println("Higher number: " + x);
 
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d;
        
        System.out.println("Digite 3 numeros.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        d = max(a, b, c);
        resultado(d);

//        double x = Math.sqrt(25);
//        System.out.println(x);
    }
}
