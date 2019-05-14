package Curso;

import java.util.Scanner;

public class Curso9WhileFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x, y;
            System.out.println("Quantos numeros voce vai querer digitar?");
            y = sc.nextInt();
            while(y<=0){
                System.out.println("Digite um valor par acima de 0.");
                x = sc.nextInt();
            }   int higher= Integer.MIN_VALUE;
            for(int i=0;i<y;i++){
                System.out.print("Numero "+ (i+1)+ ": ");
                x= sc.nextInt();
                if(x> higher) {
                    higher= x;
                }
        
            }   System.out.println("Maior: "+higher);
            sc.close();
      
//        int x=0;
//        System.out.println("Deseja usar while ou for?");
//        String y = sc.next();
//        String w = "while";
//        String f = "for";
//        
//        if(y.equals(w)){//equals compara valores das strings, se forem iguais ele retorna 1(verdadeiro/true).
//            while(x<=10){
//                System.out.println(x);
//                x++;
//            }
//        }else if(y.equals(f)){
//            for(x=0;x<=10;x++){
//                System.out.println(x+1);
//            }
//        }
//        sc.close();
        }
    }
}
