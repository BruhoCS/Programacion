package a_pescar;

public class Tablero {

	private int fila;
	private int columna;
	private int[][] tablero;

	public Tablero(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		this.tablero = new int[fila][columna];

	}

	// Getters y setters

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	// Método para establecer el estado de una casilla
	public void setEstado(int fila, int columna, int estado) {
		if (fila >= 0 && fila < this.fila && columna >= 0 && columna < this.columna) {
			this.tablero[fila][columna] = estado;
		}
	}

	// Método para mostrar el tablero
	public void showTableroGrafico() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				switch (this.tablero[i][j]) {
				case 1:
					System.out.print("# "); // Tierra
					break;
				case 2:
					System.out.print("~ "); // Mar
					break;
				case 3:
					System.out.print("* "); // Peces sí
					break;
				case 4:
					System.out.print("x "); // Peces no
					break;
				default:
					break;
				}
			}
			System.out.println();
		}
	}

	/*
	 * Método para cargar un tablero simulando la costa noroeste y las zonas de
	 * pesca
	 */
	public void setTableroCostaNoroeste() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				
			}
		}
	}

	// Método para poner a "Tierra" todo el tablero
	public void deleteTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				this.tablero[i][j] = 1; // Tierra
			}
		}
	}
}
