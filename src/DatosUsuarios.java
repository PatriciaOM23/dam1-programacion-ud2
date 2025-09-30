import java.util.Scanner;


public class DatosUsuarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tu correo electrónico: ");
        String correo = sc.nextLine();

        
        System.out.printf(nombre + edad + correo + emailValido);


        sc.close();
        

    }
}