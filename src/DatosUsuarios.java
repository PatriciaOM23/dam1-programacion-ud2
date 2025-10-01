import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu correo electrónico: ");
        String email = sc.nextLine();

       

        boolean emailValido = ProcesadorTexto.esEmailValido(email);
        boolean nombreValido = nombre.length() > 0 && nombre.length() <= 20;
        boolean edadValida = edad >= 0 && edad <= 120;
        if (emailValido && nombreValido && edadValida) {
            nombre = String.valueOf(nombre.trim().charAt(0)).toUpperCase() + nombre.substring(1).toLowerCase();

            Usuario usuario = new Usuario(nombre, edad, email);
            usuario.mostrarInformacion();
        } else {
            System.out.print("Error.");
        }


         /*

         IDEA BASE
         * if (edad <= 0 || edad >= 120 ) {
         * System.out.println("Error edad no válida");
         * }
         * 
         * if (nombre.length() <= 0 || nombre.length() >= 20) {
         * nombre = nombre.trim().substring(0,1).toUpperCase() +
         * nombre.substring(1).toLowerCase();
         * } else {
         * System.out.println("Nombre no válido.");
         * 
         * }
         */
        /*
         * - Si edad es menor que 0 o mayor que 120 mostrar un mensaje de error.
         * - Si el nombre tiene menos de 2 caracteres o mas de 20 mostrar un error
         * - Normalizar el nombre: Primera letra mayuscula, resto en minúscula ,
         * Eliminar espacios en blanco del nombre
         * 
         */

        sc.close();

    }
}