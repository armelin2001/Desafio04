package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	private String marca;
	private String modelo;
	private boolean isUsado;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	public VideoGame(){
	}
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		setMarca(marca);
		setModelo(modelo);
		setUsado(isUsado);
	}
	public String toString() {
		return super.toString()+"\nVideo-game: " + getModelo()+"  Preço: " + getPreco()+"  Quantidade: "+getQtd()+" em estoque. ";
		
	}
	public double calculaImposto() {
		double imposto = 0.25;
		
		if(isUsado()==false) {
			double resulNovo = getPreco()*imposto;
			System.out.printf("\nImposto %s ",getNome()," %s ");
			System.out.printf(getModelo());
			System.out.printf(" R$ %.2f \n" ,resulNovo);
			return 0;
		}
		else if(isUsado()==true) {
			double resulVelho = getPreco()*imposto;
			System.out.printf("\nImposto %s ",getNome()," %s ");
			System.out.printf(getModelo());
			System.out.printf(" usado R$ %.2f \n" ,resulVelho);
			return 0;
					
		}
		else {
			return 0;
		}
	}
	
}
