import utilidades.Cancion;
import utilidades.DemoMetodos;

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();

        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        // Tu código aquí ↓
              

        method.saludar();

        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        // Tu código aquí ↓
                System.out.println("EJERCICIO 2 ");

        int resultado = method.sumar(5, 3);
                System.out.println(resultado);
        System.out.println(method.presentar("Lucía"));
        


        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        // 2. Llama a method.incrementar(n).
        // 3. Imprime n después de llamar al método.
        // Tu código aquí ↓
        System.out.println("EJERCICIO 3 ");
        int n = 10;
        method.incrementar(n);
        System.out.println(n);
        // DENTRO DEL MÉTODO (SI CAMBIA PORQUE ES COMO LO QUE ESTAMOS EJECUTANDO JUSTO EN ESE MOMENTO) PERO FUERA DEL MÉTODO NO CAMBIA PORQUE SON LOS VALORES ORIGINALES (ES UN VOID)
        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor parametrizado
        //  que recibe 2 argumentos: título y artista.
        // 2. Llama a method.cambiarTitulo(cancion).
        // 3. Imprime la canción después.
        // Tu código aquí ↓
        Cancion cancion = new Cancion("Original","Will Smith");
        method.cambiarTitulo(cancion);
        System.out.println(cancion);
        

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
// Respuesta: Que me pinta por pantalla el saludo pero no me devuelve nada ya que es un método void.

// Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
// Respuesta:  Que void no te devuelve nada, te puede llegar a imprimir algo pero no te da el resultado como tal. Uno con retorno te devuelve el resultado tal como se ha realizado la operación.

// Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
// ¿Por qué?
// Respuesta: No ha cambiado porque hemos utilizado un int al usar el método incrementar (estamos trabajando dentro del método) así que la variable original se conserva.

// Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar cambiarTitulo()?
    // Que ha cambiado 
//¿Por qué es diferente al caso del int?
// Porque estamos trabajando directamente con el objeto así que si trabajamos con el titulo original
