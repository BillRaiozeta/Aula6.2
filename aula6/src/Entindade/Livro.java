package Entindade;

public class Livro {

	public String livro;
	public String autor;
	public int quantidade;
	public double valor;
	
	
	public String exibeDados() {
		return "Livro; " + livro+
				"\nAutor:" + autor +
				"\nQuantidade :" + quantidade +
				"\nValor total: " + valor;
}

	
	
public void emprestaLivro (int quantidade) {
	 this.quantidade -= quantidade;
} 
	 public void devolveLivro (int quantidade) {
		 this. quantidade += quantidade;
	 }	 
	

	public double valorTotalLivro() {
		 double valorTotal= quantidade * valor;
		 return valorTotal;
	 }
	 
	
	 
	 
	 
	 
	@Override
	public String toString() {
		return "Livro livro=" + livro + ", autor=" + autor + ", quantidade=" + quantidade + ", valor=" + valor + "Valor total" + valorTotalLivro(); 
	
	}







}