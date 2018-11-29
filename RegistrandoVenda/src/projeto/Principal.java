package projeto;
import java.util.*;
public class Principal {
	
	public static void main(String args[]) {
		
		boolean programRunner = true;
		
		while(programRunner = true) {
		
		float totalDaVenda;
		
		float x = 0;
		
		int resp = -1;
		
		char resposta;
		
		char resposta2;
		
		char trocaDeVendedor;
		
		Scanner leitor = new Scanner(System.in);
		/* produto coco*/
		Produto p1 = new Produto();
		p1.setCodigoProduto(001);
		p1.setDescricao("produto proveniente de coqueiros");
		p1.setValorVenda(10.0f);
		p1.setValorCusto(10.0f);
		p1.setPromocao(false);
		/*produto livro*/
		Produto produtoPromocao = new Produto();
		produtoPromocao.setCodigoProduto(002);
		produtoPromocao.setDescricao("livro de desenvolvimento em android");
		produtoPromocao.setValorVenda(100);
		produtoPromocao.setValorCusto(80);
		produtoPromocao.setPromocao(true);
		
		Vendedor v1 = new Vendedor();
		System.out.println("digite o nome do vendedor: ");
		v1.setNome(leitor.nextLine());
		System.out.println("digite o codigo: ");
		try {
		v1.setCodigo(leitor.nextInt());
		} catch(java.util.InputMismatchException exception) {
			System.out.println("codigo invalido");
		}
		System.out.println("digite o endereço: ");
		v1.setEndereço(leitor.nextLine());
		
		trocaDeVendedor = 'n';
		while(trocaDeVendedor == 'n') {
		Venda venda1 = new Venda();
		totalDaVenda = 0;
		venda1.quantItens = 0;
		resp = -1;
		while(resp != 000) {
		System.out.println("deseja adicionar algo na compra?(responda com o codigo do produto): ");
		try {
		resposta = ' ';
		resp = leitor.nextInt();
		} catch(java.util.InputMismatchException exception) {
			System.out.println("erro ao ler codigo do produto");
		}
		if(resp != 00) {
		System.out.println("esse produto esta em promocao ou se deseja por um desconto?S/N: ");
		resposta = leitor.next().charAt(0);
		if(resposta == 's') {
			x = venda1.efetutuarDesconto();
		} else {
			System.out.println("sem desconto");
		}
		}
			
		if(venda1.quantItens <= 0 && resp == 000) {
			System.out.println("coloque pelo menos um item");	
		}
		if(resp == 001){
			venda1.quantItens = venda1.quantItens + 1;
			System.out.println("o codigo é: " + v1.getCodigo() + "\n");
			System.out.println("o nome do vendedor é: " + v1.getNome() + "\n");
			System.out.println("a comissao foi é:" + v1.getComissao() + "\n");
			System.out.println("a quantidade de itens é: " + venda1.quantItens + "\n");
			System.out.println("o codigo do produto foi: " + p1.codigoProduto + "\n");
			System.out.println("o preco do produto foi: " + p1.getValorCusto());
			System.out.println("o produto esta em promocao? " + p1.getPromocao() + "\n");
			System.out.println("o valor do desconto foi: " + x + "\n" ); /*fazer funçao desconto*/
			System.out.println("o valor da venda foi: " + p1.valorVenda);
			totalDaVenda = totalDaVenda + p1.valorVenda;
			/*venda1.imprimir();*/
			resp = -1;
		}else if(resp == 002){
			venda1.quantItens = venda1.quantItens + 1;
			venda1.quantItens = venda1.quantItens + 1;
			System.out.println("o codigo é: " + v1.getCodigo() + "\n");
			System.out.println("o nome do vendedor é: " + v1.getNome() + "\n");
			System.out.println("a comissao foi é:" + v1.getComissao() + "\n");
			System.out.println("a quantidade de itens é: " + venda1.quantItens + "\n");
			System.out.println("o codigo do produto foi: " + produtoPromocao.codigoProduto + "\n");
			System.out.println("o preco do produto foi: " + produtoPromocao.getValorCusto());
			System.out.println("o produto esta em promocao? " + produtoPromocao.getPromocao() + "\n");
			System.out.println("o valor do desconto foi: " + x + "\n"); /*fazer funçao desconto*/
			System.out.println("o valor da venda foi: " + produtoPromocao.valorVenda);
			totalDaVenda = totalDaVenda + produtoPromocao.valorVenda;
			resp = -1;
			
			
			
			
		}
		
		
		}
		System.out.println("o valor total foi: " + totalDaVenda);
		
		System.out.println("voce deseja trocar o vendedor?s/n: ");
		resposta2 = leitor.next().charAt(0);
		if(resposta2 == 's') {
			trocaDeVendedor = 's';
		} else {
			continue;
		}
		
		
		
		}
		
		
	}
	}
}
