import utilidades.Videojuego;
import utilidades.Libro;
public class Videojuegos {
    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: toString sobrescrito
        // ================================
        // 1. Crea un Videojuego v1 con título "Minecraft" y plataforma "PC".
        // 2. Imprime v1 directamente con System.out.println(v1).

        // Tu código aquí ↓
        Videojuego v1 = new Videojuego ("Minecraft","PC");
        System.out.println(v1);
        // ================================
        // EJERCICIO 2: toString por defecto
        // ================================
        // 1. Crea un Libro l1 con título "El Quijote" y autor "Cervantes".
        // 2. Imprime l1 directamente con System.out.println(l1).

        // Tu código aquí ↓
        Libro l1 = new Libro ("El Quijote","Cervantes");
        System.out.println(l1);
        // ================================
        // EJERCICIO 3: equals sobrescrito
        // ================================
        // 1. Crea dos Videojuego con mismos datos: "Minecraft", "PC".
        // 2. Compara con == y con equals().
        // 3. Imprime los resultados.

        // Tu código aquí ↓
        Videojuego v2 = new Videojuego("Minecraft","PC");
        Videojuego v3 = new Videojuego("Minecraft","PC");

        System.out.println(v2 == v3);
        System.out.println(v1.equals(v3));        
        // ================================
        // EJERCICIO 4: equals por defecto
        // ================================
        // 1. Crea dos Libro con mismos datos: "El Quijote", "Cervantes".
        // 2. Compara con == y con equals().
        // 3. Imprime los resultados.

        // Tu código aquí ↓
            Libro l2 = new Libro ("El Quijote","Cervantes");
            Libro l3 = new Libro ("El Quijote","Cervantes");
        System.out.println(l2 == l3);
        System.out.println(l2.equals(l3));
    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué salida da un Videojuego cuando lo imprimimos?
// Respuesta: Videojuego: Minecraft en PC

// Ejercicio 2: ¿Qué salida da un Libro sin toString sobrescrito?
// Respuesta: 

// Ejercicio 3: ¿Qué devuelve == y qué devuelve equals() al comparar dos Videojuego iguales?
// Respuesta: ....................................................

// Ejercicio 4: ¿Qué devuelve == y qué devuelve equals() al comparar dos Libro iguales?
// Respuesta: ....................................................

// Reflexión final: ¿Por qué crees que es útil sobrescribir toString y equals en nuestras clases?
	// Respuesta: ....................................................
