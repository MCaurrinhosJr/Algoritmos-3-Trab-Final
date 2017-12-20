import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

	public static Scanner sn = new Scanner(System.in);
	public Cardapio cardapio = new Cardapio();
	public static Restaurante rest = null;
	public List<Pedido> Pedidos;
	public Fila fila;

	public static void main(String[] args) {
		if (rest == null) {
			rest = new Restaurante();
		}

		rest.MenuIni();
		int escolha = sn.nextInt();
		System.out.println("\n");
		do {
			switch (escolha) {
			case 1:
				// Novo Pedido
				break;
			case 2:
				// Mostrar Cardapio
				rest.ListaCardapio();
				break;
			case 3:
				// Fechar Pedido
				break;
			case 4:
				// Listar Pedidos
				rest.ListaPedidos();
				break;
			case 5:
				// Ver Pedido
				System.out.println("\n 5 - Ver Pedido");
				System.out.println("\n\n Informe o numero do pedido desejado:");
				rest.ListaPedidos();
				int Op = sn.nextInt();
				rest.getPedido(Op);
				break;
			}
		} while (escolha != 0);

	}

	public void ListaCardapio() {
		for (item items : cardapio.Items) {
			System.out.println("Prato: " + items.getNome());
			System.out.println("\n-------------------------------");
			System.out.println("\nIngredientes:");
			System.out.println("\n    " + items.getDescricao());
			System.out.println("\n");
		}
	}

	public void ListaPedidos() {
		for (Pedido pedidos : Pedidos) {
			System.out.println("\n" + pedidos.ID + " - " + pedidos.getNome());
		}
	}

	public void MenuPedido(Pedido pedidoAtual) {
		System.out.println("[1] Adicionar um Item");
		System.out.println("[2] Gravar Pedido");
		System.out.println("[0] Cancelar Pedido");
		int Op = sn.nextInt();
		do {
			switch (Op) {
			case 1:
				rest.ListaCardapio();
				int Opt = sn.nextInt();
				pedidoAtual.ingredientes.add(rest.getItem(Opt));
				break;
			case 2:
				rest.fila.inserir(pedidoAtual);
				break;
			}
		} while (Op != 0);
	}

	public void getPedido(int pedido) {
		// Le os dados do pedido solicitado e os apresenta
		Pedido pedTemp = Pedidos[pedido];
		System.out.println("\n [" + pedTemp.ID + "]" + pedTemp.getNome());
		rest.MenuPedido(pedTemp);
		int Op = sn.nextInt();
	}

	public void MenuIni() {
		System.out.println("\n [1] Novo Pedido");
		System.out.println("\n [2] Mostrar Cardapio");
		System.out.println("\n [3] Fechar Pedido");
		System.out.println("\n [4] Listar Pedidos");
		System.out.println("\n [5] Ver Pedidos");
		System.out.println("\n [0] Sair");
	}
}
