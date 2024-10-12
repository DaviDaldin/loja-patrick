package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Produto {
   private String nome;
   private double preco;
   private int qtd;
   public List<Produto> listaProdutos = new ArrayList<>();
   public Produto(String nome, double preco, int qtd) {
       this.nome = nome;
       this.preco = preco;
       this.qtd = qtd;
   }
   public String getNome() {
       return nome;
   }
   public double getPreco() {
       return preco;
   }
   public int getQtd() {
       return qtd;
   }
   public void cadastro(Scanner sc) {
       System.out.print("Digite quantos produtos você deseja cadastrar: ");
       int qtd = sc.nextInt();
       sc.nextLine();
       for (int i = 0; i < qtd; ++i) {
           System.out.printf("Digite o nome do produto %d: ", i + 1);
           nome = sc.nextLine();
           System.out.printf("Digite o preço do produto %d: ", i + 1);
           preco = sc.nextDouble();
           System.out.print("Digite a quantidade do produto: ");
           this.qtd = sc.nextInt();
           sc.nextLine();
           Produto produto = new Produto(nome, preco, this.qtd);
           listaProdutos.add(produto);
       }
   }
   public void lista() {
       if (listaProdutos.isEmpty()) {
           System.out.println("Nenhum produto cadastrado.");
       } else {
           System.out.println("--- Lista de Produtos ---");
           for (Produto p : listaProdutos) {
               System.out.printf("Nome: %s, Preço: %.2f, Quantidade: %d%n", p.getNome(), p.getPreco(), p.getQtd());
           }
       }
   }
}
