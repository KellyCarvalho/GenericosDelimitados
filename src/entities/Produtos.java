package entities;

public class Produtos implements Comparable<Produtos> {
	
	private String nome;
	private double preco;
	public Produtos(String nome, double preco) {
	
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public int compareTo(Produtos outro) {
		// TODO Auto-generated method stub
		return Double.compare(preco, outro.getPreco());
	}
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", preco=" + preco + "]";
	}
	

}
