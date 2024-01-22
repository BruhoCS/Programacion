package ejercicio14;

public class FichaDomino {
	private int ladoD;
	private int ladoI;
	private int[][] ficha;

	// Constructor
	public FichaDomino(int LD, int LI) {
		this.ladoD = LD;
		this.ladoI = LI;
		this.ficha = new int[LD][LI];
	}

	// Getters
	public int getLadoD() {

		return this.ladoD;
	}

	public int getLadoI() {
		return this.ladoI;
	}

	// Metodos
	public void encaja(FichaDomino ficha) {
		int [][]fichaNew = new int [this.ladoD][this.ladoI];

		for (int i = 0; i < this.ficha.length; i++) {
			for (int j = 0; i < this.ficha[i][j]; j++) {
				if(this.ficha == fichaNew) {
					System.out.println("Encajaste las fichas: "+ this.ficha + " y "+fichaNew);
				}
			}
		}
	}

	public void voltea() {
		
	}
}
