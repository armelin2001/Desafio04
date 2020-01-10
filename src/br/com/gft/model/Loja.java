package br.com.gft.model;
import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros = new ArrayList<Livro>();
	private List<VideoGame> videoGames = new ArrayList<VideoGame>();
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		setNome(nome);
		setCnpj(cnpj);
		setLivros(livros);
		setVideoGames(videoGames);
	}
	public void listaLivros() {
		int produto = livros.size();
		if(produto != 0){
			for(Livro livro: getLivros()) {
				System.out.println(livro);
				}
			
		}
		else {
			System.out.println("A loja não tem livros em seu estoque.\n");
		}
	}
	public void listaVideoGames() {
		int produto = videoGames.size();
		if(produto != 0){
			for(VideoGame game: getVideoGames()) {
			System.out.println(game);
			}
		}
		else {
			System.out.println("A loja não tem livros em seu estoque.\n");
		}
	}
	public double calculaPatrimonio() {
		double total = 0;
		double totalLivro = 0;
		double totalGames = 0;
		for(Livro livro: livros) {
			totalLivro += livro.getQtd() * livro.getPreco();
		}
		for(VideoGame game: videoGames) {
			totalGames += game.getQtd() * game.getPreco();
		}
		total = totalGames + totalLivro;
		System.out.printf("\nO patrimonio da loja %s é de R$ %.2f \n",getNome(),total);
		return 0;
	}
}
