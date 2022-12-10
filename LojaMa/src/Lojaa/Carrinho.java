package Lojaa;



public class Carrinho extends Produto{
	private int codigo;
	private String modelo;
	private String marca;
	private int quantidade;
	private double valor;
	
	public Carrinho(int codigo, String modelo, String marca, int quantidade, double valor) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.marca = marca;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Carrinho [codigo=" + codigo +  ", modelo=" + modelo + ", marca=" + marca
				+ ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void remove(int i) {
		// TODO Auto-generated method stub
		
	}
	
	}

