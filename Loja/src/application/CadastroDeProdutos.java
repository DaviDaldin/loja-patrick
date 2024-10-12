package application;
import entities.Produto;
import java.util.Scanner;
public class CadastroDeProdutos {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Produto produto = new Produto("", 0, 0);
       int x;
       do {
           System.out.println("--- Bem-vindo ao cadastro de produtos da loja! ---");
           System.out.println("Digite o que deseja fazer: \n"
                   + "1- Cadastrar produtos\n"
                   + "2- Listar produtos\n"
                   + "3- Sair");
           x = sc.nextInt();
           sc.nextLine();
           switch (x) {
               case 1:
                   produto.cadastro(sc);
                   break;
               case 2:
                   produto.lista();
                   break;
               case 3:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Selecione uma opção válida");
           }
       } while (x != 3);
       sc.close();
   }
}
