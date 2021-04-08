import java.util.ArrayList;
//import java.util.Collections;


public class Ejercicio6 {
  public static void main(String[] args) {

    Do.clear();

    // Tambien funciona
    // var listaUsuarios = new ArrayList<>();

    // Mi función al solo soportar el tipo 'Object' el 'ArrayList' tiene que ser del tipo object
    var listaUsuarios = new ArrayList<Object>();

    Do.addTo(listaUsuarios
    ,new HashMap("Lola", "c29uaWMgMjAwNg==")
    ,new HashMap("Kira", "c29uaWMgdW5sZWFzaGVk==")
    ,new HashMap("James", "bGEgbGV5ZW5kYSBkZSBzcHlybw====")
    );


    var intentos = 3;

    while(intentos > 0) {
      Do.print( Do.color(true, "g", "b", "Introduzca su nombre de usuario\n> ") );
      var usuario = Do.inputString();

      Do.print( Do.color(true, "g", "b", "Introduzca su contraseña\n> ") );
      var contrasena = Do.inputString();

      var acceso = false;
      
      // Comprobar si el usuario y la contraseña introducidos coinciden con los de algún usuario del 'ArrayList'
      for(var i = 0; i < listaUsuarios.size(); i++) {

        if(// Al ser del tipo génerico 'Object' hay que transformarlo con un casting a la clase original
          usuario    .equals( ((HashMap)listaUsuarios.get(i)).usuario ) &&
          contrasena .equals( ((HashMap)listaUsuarios.get(i)).constrasena )
        ) {
          Do.println( Do.color(true, "y", "b", "Ha accedido al área restringida") );
          acceso = true;
          break;
        }
        
      }

      if(acceso) { break; }

      // Restar 1 a los intentos
      intentos--;

      Do.println(
        Do.color(true, "r", "b", "Lo siento, el usuario o la contraseña son incorrectos\n") +
        Do.color(true, "y", "b", "Le quedan " + intentos + " intentos.")
      );

      Do.println();
    }

    Do.println();

  }
}