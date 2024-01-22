package a_pescar;

public class Instanciadora {

	public static void main(String[] args) {

		// Instanciar un Tablero de ejemplo (7x16)
		Tablero tablero = new Tablero(7, 12);

		// Cargar el tablero con la costa noroeste y zonas de pesca
		tablero.setTableroCostaNoroeste();

		// Mostrar el tablero
		System.out.println("\nTablero con símbolos gráficos:");
		tablero.showTableroGrafico();
	}

}
