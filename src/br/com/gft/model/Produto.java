package br.com.gft.model;
public abstract class Produto {
	private String nome;
	private double preco; 
	private int qtd;
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
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
	public Produto(){
	}
	public Produto(String nome, double preco, int qtd){
		setNome(nome);
		setPreco(preco);
		setQtd(qtd);
	}
	public String toString() {
		String retorno="";
		return retorno;
	}
}
