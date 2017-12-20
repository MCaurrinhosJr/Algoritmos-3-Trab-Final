
public class item {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public item() {}
	public item(String nome) {
		this.nome = nome;
	}
	public item(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
}
