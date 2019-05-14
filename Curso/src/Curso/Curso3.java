package Curso;




import java.util.Locale;
import java.util.Scanner;

public class Curso3 {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            

            float a, b, c, area;
            
            System.out.println("Digite os valores de A, B e C respectivamente.");
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            
            area = a * c / 2;
            System.out.printf("Area do triangulo de base A e altura C: %.3f%n", area);
            
            area = (float)((3.14159 * (c*c)));
            System.out.printf("Area do circulo de raio C: %.3f%n", area);
            
            area = (float)(((a + b)*c)/2);
            System.out.printf("Area do trapezio de A e B como bases e C como altura: %.3f%n", area);
            
            area = b*b;
            System.out.printf("Area do quadrado de lado B: %.3f%n", area);
            
            area = a*b;
            System.out.printf("Area do retangulo de lado A e lado B: %.3f%n", area);
            sc.close();          
            
            int n1, n2, qt1, qt2;
	    double p1, p2, tt;

	    n1 = sc.nextInt();
	    qt1 = sc.nextInt();
	    p1 = sc.nextDouble();
	    
	    n2 = sc.nextInt();
	    qt2 = sc.nextInt();
	    p2 = sc.nextDouble();

	    tt = p1 * qt1 + p2 * qt2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", tt);
		
            sc.close();    
            
            int num, hrs;
            double din;
            
            num = sc.nextInt();
            hrs = sc.nextInt();
            din = sc.nextDouble();
            
            double sal = (din * hrs);
            
            System.out.printf("%d %.2f%n",num,sal);
            
            sc.close();
            
            int ax,bx,cx,dx;
            
            ax = sc.nextInt();
            bx = sc.nextInt();
            cx = sc.nextInt();
            dx = sc.nextInt();
            
            System.out.println(ax*bx-cx*dx);
                     
            double area2, pi = 3.14;
            double raio = sc.nextDouble();
            
            area2 = pi * (raio * raio);
            System.out.printf("%.4f %n", area2);
            
            sc.close();
              
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            x = x + y;
            
            System.out.println(x);
            sc.close();            
            
}
}
