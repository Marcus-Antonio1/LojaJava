package Lojaa;
//ALuno: Marcus Antônio Toledo Silva

//O codigo é para um dono de loja ou administrador onde ele pode adicionar produtos e colocar e retirar do carrinho para fins de testes
//Professor tem um erro no código onde para listar os produtos sem ser no carrinho as strings aparecem como null 
//se o senhor puder me dizer onde está o erro para que eu possa arrumar na proxima entrega eu realmente não consegui entender e encontrar esse erro

public class Principal {

	public static void main(String[] args) {
		Loja loja = new Loja();

		while (true) {
			System.out.println("********************************************************");
			System.out.println("   MENU DA SUA LOJA PREFERIDA DE ELETRONICOS   ");
			System.out.println("********************************************************");
			System.out.println("");
			System.out.println("1. Listar produtos  ");
			System.out.println("2. Adicionar produtos      ");
			System.out.println("3. Procurar produto usando o código   ");
			System.out.println("4. Adicionar produtos no carrinho   ");
			System.out.println("5. Mostrar produtos que estão no carrinho    ");
			System.out.println("6. Remover produto do carrinho usando seu código");
			System.out.println("7. SAIR        ");
			System.out.println("Digite Sua Opcao        ");
			System.out.println("");

			int opcao = Teclado.leInt();

			try {

				if (opcao == 1) { // listar produtos
					for (Produto produtos : loja.getProduto()) {
						System.out.println(produtos);
					}
				} else if (opcao == 2) {// adicionar novo produto
					System.out.println("Digite o código do produto:");
					int codigo = Teclado.leInt();
					if (loja.getProdutoComCodigo(codigo) != null) {
						System.out.println("Já existe um produto com esse código");
					} else {
						System.out.println("1. Celular");
						System.out.println("2. Notebook");
						System.out.println("3. Televisão");

						int opcaoCadastrarProdutoNovo = Teclado.leInt();

						if (opcaoCadastrarProdutoNovo == 1) { // adicionando produtos por tipos
							System.out.println("Digite o modelo do celular");
							String modelo = Teclado.leString();
							System.out.println("Digite a marca do celular");
							String marca = Teclado.leString();
							System.out.println("Digite o valor do celular");
							double valor = Teclado.leDouble();
							System.out.println("Digite a descrição do celular:");
							String descricao = Teclado.leString();
							Celular celular = new Celular(modelo, marca, descricao, valor, codigo);
							loja.adicionarCelular(celular);
							System.out.println(" Seu produto foi adicionado a loja ");

						} else if (opcaoCadastrarProdutoNovo == 2) {
							System.out.println("Digite o modelo do Notebook");
							String modelo = Teclado.leString();
							System.out.println("Digite a marca do Notebook");
							String marca = Teclado.leString();
							System.out.println("Digite o valor do Notebook");
							double valor = Teclado.leDouble();
							System.out.println("Digite a descrição do Notebook:");
							String descricao = Teclado.leString();
							Notebook notebook = new Notebook(modelo, marca, descricao, valor, codigo);
							loja.adicionarNotebook(notebook);
							System.out.println(" Seu produto foi adicionado a loja ");

						} else if (opcaoCadastrarProdutoNovo == 3) {
							System.out.println("Digite o modelo da Televisão");
							String modelo = Teclado.leString();
							System.out.println("Digite a marca da Televisão");
							String marca = Teclado.leString();
							System.out.println("Digite o valor da Televisão");
							double valor = Teclado.leDouble();
							System.out.println("Digite a descrição da Televisão:");
							String descricao = Teclado.leString();
							Televisao televisao = new Televisao(modelo, marca, descricao, valor, codigo);
							loja.adicionarTelevisao(televisao);
							System.out.println(" Seu produto foi adicionado a loja ");

						} else {
							System.out.println("Comando Inválido");
						}
					}
				} else if (opcao == 3) { // procurar produto pelo codigo
					System.out.println("Digite o código do produto que deseja visualizar:");
					int codigo = Teclado.leInt();
					Produto produto = loja.getProdutoComCodigo(codigo);
					if (produto == null) {
						System.out.println("Não existe Produto com esse código");
					} else {
						System.out.println(produto);
					}
				} else if (opcao == 4) { // adicionar produto ao carrinho

					System.out.println("Digite o código do produto que deseja adicionar ao carrinho:");
					int codigo = Teclado.leInt();
					Produto produto = loja.getProdutoComCodigo(codigo);

					if (produto == null) {

						System.out.println("Não existe Produto com esse código");

					} else {

						double valor = produto.getValor();
						String modelo = produto.getModelo();
						String marca = produto.getMarca();
						System.out.println("Digite quantos " + produto.getModelo() + ", deseja comprar:");
						int quantidade = Teclado.leInt();
						Carrinho produtosCarrinho = new Carrinho(codigo, modelo, marca, quantidade, valor);
						loja.adicionarProdutosCarrinho(produtosCarrinho);
					}
				} else if (opcao == 5) { // mostrar produtos que estão no carrinho

					for (Carrinho produtosCarrinho : loja.getCarrinho()) {
						System.out.println(produtosCarrinho);
					}

				} else if (opcao == 6) { // removendo produtos do carrinho usando o código do produto

					System.out.println("Digite o código do produto que deseja remover do carrinho");
					int index = Teclado.leInt();

					loja.removerProdutoDoCarrinho(index);
					System.out.println(" O produto foi removido do seu carrinho ");

				}

				else if (opcao == 7) {
					System.out.println(" OBRIGADO E VOLTE SEMPRE ");
					break;

				} else {
					System.out.println(" Opção inválida, por favor digite uma opção válida!! ");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
