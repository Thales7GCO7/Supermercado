import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCaixa {
    private ArrayList <Produto> carrinho = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to add a Produto to the carrinho
    public void addProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double price = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Produto Produto = new Produto(nome, price, quantity);
        carrinho.add(Produto);
        System.out.println("Produto adicionado ao carrinho!");
    }

    // Method to remove a Produto from the carrinho
    public void removeProduto() {
        System.out.print("Digite o nome do produto que deseja remover: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Produto Produto : carrinho) {
            if (Produto.getnome().equalsIgnoreCase(nome)) {
                carrinho.remove(Produto);
                System.out.println("Produto removido do carrinho!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }

    // Method to mostrar all Produtos in the carrinho
    public void mostrarcarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho: ");
            for (Produto Produto : carrinho) {
                System.out.println(Produto);
            }
        }
    }

    // Method to calculate and mostrar the total cost
    public void mostrarTotal() {
        double total = 0;
        for (Produto Produto : carrinho) {
            total += Produto.getTotalCost();
        }
        System.out.println("Total da compra: R$ " + total);
    }

    // Main menu for the cashier system
    public void run() {
        while (true) {
            System.out.println("\n--- Sistema Supermercado ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Vizualizar carrinho");
            System.out.println("4. Calcular total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduto();
                    break;
                case 2:
                    removeProduto();
                    break;
                case 3:
                    mostrarcarrinho();
                    break;
                case 4:
                    mostrarTotal();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.");
            }
        }
    }
}