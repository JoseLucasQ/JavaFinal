package projeto;
import java.util.*;
 public class Venda extends Vendedor {
	 
	 Scanner leitor = new Scanner(System.in);
	
	Vendedor v1 = new Vendedor();
	
	public float desconto;
	public int quantItens;
	public float valor;
	public float total;
	public float novoValor;
	
	public float getDesconto() {
		return this.desconto;
	}
	public void setModelo(float desconto) {
		this.desconto = desconto;
	}
	public int getQuantItens() {
		return this.quantItens;
	}
	public void setQuantItens(int quantidade) {
		this.quantItens = quantidade;
	}
	public float getValor() {
		return this.valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Venda() {
		desconto = 0;
		quantItens = 0;
		valor = 0;
	}
	
	public float efetutuarDesconto(){
		int porcentagem = 0;
		System.out.println("digite quantos porcento de desconto");
		try {
		porcentagem = leitor.nextInt();
		} catch(java.util.InputMismatchException exception) {
			System.out.println("valor em porcentagem invalido: ");
		}
		desconto = ((porcentagem / 100) * 10);
		novoValor = super.getValorVenda() - desconto;
		if(novoValor < super.getValorCusto()) {
			return novoValor;
		}else {
			System.out.println("o valor do produto ficou abaixo do valor de custo,nao e possivel fazer o desconto");
			
		}
		return 0;
		
			
		}
		public float calcularValor(){
			total = (quantItens + super.valorVenda) - desconto;	
			return this.total;
		}
		public Venda calcularComissao() {
			this.setComissao(super.valorCusto * 0.1f);
			return this;
			
			
		}
		public void imprimir() {
			System.out.println("codigo \n");
			System.out.println("vendedor:" + this.getNome() + "\n");
			System.out.println("comissao" + super.getComissao() + "\n");
			System.out.println("\n");
			System.out.println("o numero de produtos comprados foi" + this.quantItens);
			System.out.println("o codigo do produto é: " + super.getCodigoProduto() + "e sua descriçao é " + super.getDescricao());
			System.out.println("o valor do produto foi: " + super.getValorVenda());
			System.out.println("o produto esta em promoçao?" + super.getPromocao());
			System.out.println("o valor do desconto do produto foi: ");
			System.out.println("o valor da venda foi: " + this.total);
			/* revisar essa parte do codigo,talvez seja preciso mudar as variaveis*/
			/*nao conseguir implementar isso*/
			
			
			
		}
	}

	
	


