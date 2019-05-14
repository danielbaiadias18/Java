package cursopoo;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produtos;


public class ProdutosEmEstoque {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produtos produtos = new Produtos();
        System.out.println("Entre com as informacoes do produto: ");
        System.out.println("Nome:");
        produtos.name = sc.nextLine();
        
        System.out.println("Preco:");
        produtos.price = sc.nextDouble();
        
        System.out.println("Quantidade em estoque:");
        produtos.qnt = sc.nextInt();

        System.out.println("Dados do produto: " + produtos);
        
        System.out.println();
        
        System.out.println("Entre com o numero de produtos a serem adicionados no estoque: ");
        int qnt = sc.nextInt();
        produtos.addProd(qnt);
        
        System.out.println("Dados atualizados do produto: " + produtos);
        
        System.out.println();
        
        System.out.println("Entre com o numero de produtos a serem removidos do estoque: ");
        qnt = sc.nextInt();
        produtos.remProd(qnt);
        
        System.out.println("Dados atualizados do produto: " + produtos);
        
    }
    
}
