package Curso;

import java.util.Scanner;

public class Curso7CondicaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int x = sc.nextInt();
        String num;
        
        num = (x%2==0)? "Numero Par" : "Numero Impar";
        System.out.println(num);
        sc.close();
    }
}
