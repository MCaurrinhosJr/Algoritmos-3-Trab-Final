import java.util.List;

public class Cardapio {
	public List<item> Items;
	
	public Cardapio() {
		this.ConstruirCardapio();
	}
	
	private void ConstruirCardapio() {
		/* Colocar todo o cardapio aqui. */
		this.Items.add(new item("Xis Salada", "Pão de Xis, bife, ovo, tomate, alface, queijo e presunto"));
		this.Items.add(new item("",""));
	}
}
