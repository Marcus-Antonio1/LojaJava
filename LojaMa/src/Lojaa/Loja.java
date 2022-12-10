package Lojaa;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private ArrayList<Carrinho> produtosNoCarrinho = new ArrayList<>();
	
	public void adicionarCelular(Celular c) {
		produtos.add(c);
	}
	public void adicionarNotebook(Notebook n) {
		produtos.add(n);
	}
	public void adicionarProdutosCarrinho(Carrinho p) {
		produtosNoCarrinho.add(p);
	}
	public void adicionarTelevisao(Televisao t) {
		produtos.add(t);
	}
	public void listarProdutos() {
		for (Produto p : produtos) {
			System.out.println(p.getCodigo() + " -- "  + " -- " + p.getModelo() + " -- " + p.getMarca() +  " -- " + p.getValor()+ "R$");
		}
	}
	
	
	public void listarProdutosCarrinho() {
		for (Carrinho p : produtosNoCarrinho) {
			System.out.println(p.getCodigo() + " -- "  + p.getModelo() + " -- " + p.getMarca() + " -- " + p.getQuantidade() + " -- " + p.getValor()+ "R$");
		}
	}
	
	public ArrayList<Carrinho> getCarrinho() {
		return produtosNoCarrinho;
	}
	
	public ArrayList<Produto> getProduto() {
		return produtos;
	}
	
	public Produto getProdutoComCodigo(int codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}
	
	public Carrinho getProdutoDoCarrinhoComCodigo(int codigo) {
		for (Carrinho pCarrinho : produtosNoCarrinho) {
			if (pCarrinho.getCodigo() == codigo) {
				return pCarrinho;
			}
		}
		return null;
	}
	public void removerProdutoDoCarrinho(int index) {
		int tamanhoDoCarrinho = Carrinho.size();
		if (index > tamanhoDoCarrinho | index < 1) {
			throw new ArrayIndexOutOfBoundsException("Escolha uma opção válida");
	}
		Carrinho.remove(index - 1);
}
}