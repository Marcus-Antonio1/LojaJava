package Lojaa;

import java.util.ArrayList;

public class Produto {
	// Variaveis
	
	protected Double valor;
	protected int codigo;
	protected String modelo;
	protected String marca;
	protected String descricao;
	public Produto() {
		super();
		}
	
	@Override
	public String toString() {
		super.toString();
		return "Produto [  valor=" + valor + ", codigo=" + codigo + ", modelo=" + modelo + ", marca="
				+ marca + ", descricao=" + descricao + "]";
	}


	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	




	

}
