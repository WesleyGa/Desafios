package oo.composicao.compras;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "wesley";
		// adicionando com o métedo de adicionar itens
		c1.adicionarItem(new Item("caneta", 4, 7.45));
		c1.adicionarItem(new Item("lapis", 9, 7));
		c1.adicionarItem(new Item("jaqueta", 6, 9.4));
 
		Compra c2 = new Compra();
		c2.cliente = "gabriel";
		// adicionando com o metedo do array
		c2.itens.add(new Item("carrinho", 2, 9.81));
		c2.itens.add(new Item("caderno", 10, 9));
		c2.itens.add(new Item("corretivo", 19, 200));
		

		System.out.println("Cliente : " + c1.cliente);
		for (Item itens : c1.itens) {
			System.out.println("Item " + c1.itens.indexOf(itens) + " : " + itens.nome);
			System.out.println("Quantidade de " + itens.nome + " : " + itens.quantidade);
			System.out.println("Preço da " + itens.nome + " : " + itens.preco);
			System.out.println("-----------------------------------------------------------");
		}
		System.out.println("Valor total do carrinho de " + c1.cliente + " : " + c1.valorTotal());
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");

		System.out.println("Cliente : " + c2.cliente);
		for (Item itens : c2.itens) {
			System.out.println("Item " + c2.itens.indexOf(itens) + " : " + itens.nome);
			System.out.println("Quantidade de " + itens.nome + " : " + itens.quantidade);
			System.out.println("Preço da " + itens.nome + " : " + itens.preco);
			System.out.println("-----------------------------------------------------------");
		}

		System.out.println("Valor total do carrinho de " + c2.cliente + " : " + c2.valorTotal());
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");

	}

}
