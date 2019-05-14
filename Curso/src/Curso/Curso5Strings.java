package Curso;

public class Curso5Strings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();//elimina espaços nas pontas das strings
        String s4 = original.substring(2);
        String s5 = original.substring(2, 9);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");//primeira posição onde se encontra o valor dado no parâmetro
        int j = original.lastIndexOf("bc");//ultima posição onde se encontra o valor dado no parâmetro
        String[] vet = original.split(" ");//recorta a string e coloca em um vetor, o parametro define onde serão os "cortes"
            String w1 = vet[0], w2 = vet[1], w3 = vet[2], w4 = vet[3], w5 = vet[4];
        
        System.out.println("Original(): -" + original + "-");
        System.out.println("toLowerCase(): -" + s1 + "-");
        System.out.println("toUpperCase(): -" + s2 + "-");
        System.out.println("trim(): -" + s3 + "-");
        System.out.println("substring(2): -" + s4 + "-");
        System.out.println("substring(2, 9): -" + s5 + "-");
        System.out.println("replace('a', 'x'): -" + s6 + "-");
        System.out.println("replace('abc', 'xy'): -" + s7 + "-");
        System.out.println("indexOf('bc'): -" + i + "-");
        System.out.println("lastIndexOf('bc'): -" + j + "-");
        System.out.println("split(' '): " + w1 +" " + w2 + " " + w3 + " " + w4 + " " + w5);
    }
    
}
