package projeto;
import java.util.*;
public class Produto {
	
	public int codigoProduto;
	public String descricao;
	public float valorVenda;
	public float valorCusto;
	public boolean promocao;
	
	public int getCodigoProduto() {
		return this.codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return this.valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCusto() {
		return this.valorCusto;
	}
	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}
	public boolean getPromocao() {
		return this.promocao;
	}
	public void setPromocao(boolean Promocao) {
		this.promocao = Promocao;
	}
	
	public Produto() {
		codigoProduto = 0;
		descricao = "descriçao do produto";
		valorVenda = 0;
		valorCusto = 0;
		valorCusto = 0;
		
	}
	
	
}
