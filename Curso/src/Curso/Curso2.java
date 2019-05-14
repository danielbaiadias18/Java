package Curso;



import java.util.Locale;
import java.util.Scanner;


public class Curso2 {
    public static void main(String[] args) {
     
        
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        String nome = sc.nextLine();
        char sexo = sc.next().charAt(0);
        int idade = sc.nextInt();
        double altura = sc.nextDouble();
        
        System.out.println(nome + " " + sexo + " " + idade + " " + altura);
        
         
        
        
        Integer c = Integer.valueOf("100", 10); //100 na base 2 = 4 na base 10.
		System.out.println(c);
        
        
        int n1 = sc.nextInt();
        
        sc.nextLine();//flush
    
        String name = sc.nextLine();
        
        char gender = sc.next().charAt(0);//charAt pega o char da posição no parâmetro
        
        String s = sc.next();
        char letter = s.charAt(0);
        
        int digit = Integer.parseInt(s.substring(1));//charAt não pode ser convertido em String

        System.out.println(letter);
        System.out.println(digit);
        

        double n2 = sc.nextDouble();
        
        System.out.println(n2);
        
        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        
        
    }
}
