package projeto;
import java.util.*;
public class Vendedor extends Produto {
	
	private String nome;
	private int codigo;
	private float comissao;
	private String endereço;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getComissao() {
		return this.comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public String getEndereço() {
		return this.endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
	
	

}
