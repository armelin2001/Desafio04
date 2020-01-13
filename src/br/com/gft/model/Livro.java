package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPag;
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	public Livro(){
	}
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super (nome, preco, qtd);
		setAutor(autor);
		setTema(tema);
		setQtdPag(qtdPag);
	}
	public String toString() {
		return super.toString()+"\nTitulo: "+getNome()+"  Preço: " + getPreco()+ "  Quantidade: "+getQtd()+" em estoque. ";
	}
	@Override
	public double calculaImposto() {
		double impostoLivro = 0.10;
		if(getTema().equals("educativo")) {
			System.out.printf("\nLivro educativo não tem imposto: %s \n",getNome());
			return 0;
		}
		else {
			double imposto = getPreco() * impostoLivro;
			System.out.printf("R$ %.2f de impostos sobre o livro %s \n",imposto,getNome());
			return 0;
		}
	}
}
