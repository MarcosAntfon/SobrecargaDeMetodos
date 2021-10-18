package TestSobrecargadeMetodos;

import DominioSobrecargadeMetodos.Animes;

public class AnimesTest01 {
 
	public static void main(String[] args) {
		
		Animes animes = new Animes();
		animes.init("Dragon Ball Super 2", "TV", 15,"Ação");
		animes.imprime();

		//animes.init("Dragon Ball Super", "TV", 15);
		//animes.setNome("Dragon Ball Super");
		//animes.setTipo("TV");
		//animes.setEpisodios(15);
		//animes.setGenero("Ação");
	}
}
