package calculonota;

import java.util.Locale;
import java.util.Scanner;
import entidades.Student;

public class CalculoNota {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        
        System.out.println("Informe os dados do estudante: ");
        System.out.println("Nome: ");
        student.name = sc.nextLine();
        
        System.out.println();
        
        System.out.println("Primeira nota: ");
        student.notas[0] = sc.nextFloat();
        
        System.out.println("Segunda nota: ");
        student.notas[1] = sc.nextFloat();
        
        System.out.println("Terceira nota: ");
        student.notas[2] = sc.nextFloat();
        
        System.out.println();
        
        float soma = student.SomaNotas();
        
        System.out.println("A soma das notas do aluno e: ");
        
        System.out.println(student.FinalResult(soma));
    }
    
}
