package Lojaa;

public class Notebook extends Produto {
	private String modelo;
	private String marca;
	private String descricao;
	

	public Notebook(String modelo, String marca, String descricao, Double valor, int codigo ) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
		
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
