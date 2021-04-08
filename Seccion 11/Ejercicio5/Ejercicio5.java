import java.util.ArrayList;
//import java.util.Collections;


public class Ejercicio5 {
  public static void main(String[] args) {

    Do.clear();

    var listaPeliculas = new ArrayList<>();

    Do.addTo(listaPeliculas
    ,new Pelicula("1", "Pequeños Detalles", 128, 2021, "Policiaca")
    ,new Pelicula("2", "Un Oceano entre Nosotros", 112, 2017, "Aventura")
    ,new Pelicula("3", "La Deuda", 113, 2010, "Thriller")
    );

    // Menu principal
    String[] opcionesInicio = {
			 "1. Listado completo"
			,"2. Nueva película"
			,"3. Borrado"
			,"4. Edición"
      ,"5. Salir"
			,"\nElige una opción (1-5): "
		};

		String menuInicio = Do.color( true, "green", "", menu("Menu", opcionesInicio) );

    Do.println(menuInicio);

    int opcionMenu = Do.inputInt();


    switch(opcionMenu) {
      case 1:
        Do.println();
        Do.println("Listado completo de las películas");

        for(var pelicula : listaPeliculas) {
          Do.println(pelicula);
        }
        break;
      
      case 2:
    }

    Do.println();

  }

  // Función que toma como argumento un 'titulo' y un 'array de opciones'
	// de tipo String y devuelve el 'menu' que se puede almacenar en una variable
	public static String menu(String titulo, String[] opciones) {

		String menu;

		menu = titulo.toUpperCase() + "\n";

		// Subrayado del titulo
		for(int i = 1; i <= titulo.length(); i++) {
			menu = menu + "=";
		}
		menu = menu + "\n";

		menu = menu + "\n";

		// Dibujar las opciones contenidas en el array
		for(int i = 0; i < opciones.length; i++) {
			menu = menu + opciones[i] + (i != opciones.length - 1 ? "\n" : ""); // La última opción no recibe salto de linea
		}

		return menu;

	}
}