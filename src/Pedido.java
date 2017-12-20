import java.util.List;

public class Pedido {

	public int ID;

	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private double complexidade;
	
	public double getComplexidade() {
		return complexidade;
	}
	public void setComplexidade(double complexidade) {
		this.complexidade = complexidade;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<item> ingredientes;
}
