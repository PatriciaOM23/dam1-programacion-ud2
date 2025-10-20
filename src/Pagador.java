import utilidades.Pago;

public class Pagador {
    public static void main(String[] args) {
        // Elige si trabajas con Pago o con Mensajero
        // Aquí un ejemplo con Pago:

        Pago pago = new Pago(2000);

        // ================================
        // EJERCICIO 1: Pagar en efectivo
        // ================================
        // 1. Llama al método pagar(double) pasando una cantidad.
        // 2. Observa qué se imprime.
        // Tu código aquí ↓
        pago.pagar(23);
        // ================================
        // EJERCICIO 2: Pagar con tarjeta
        // ================================
        // 1. Llama al método pagar(double, String) pasando cantidad y un pin.
        // 2. Imprime el resultado.
        // Tu código aquí ↓
        pago.pagar(100, "2345");


        // ================================
        // EJERCICIO 3: Pagar con Bizum
        // ================================
        // 1. Llama al método pagar(double, int) pasando cantidad y un número de teléfono.
        // 2. Imprime el resultado.
        // Tu código aquí ↓
        pago.pagar(20.1,643223421);

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Pregunta 1: ¿Qué información mínima (parámetros) se necesita para realizar un pago?
// Respuesta: ....................................................

// Pregunta 2: ¿En qué se diferencia el pago con tarjeta respecto al pago en efectivo?
// Respuesta: ....................................................

// Pregunta 3: ¿Por qué es útil que todos se llamen "pagar"?
// Respuesta: ....................................................

// Pregunta 4: ¿Qué pasaría si en lugar de pagar() hubiera métodos llamados pagarEfectivo(), pagarTarjeta(), pagarBizum()?
// ¿Qué ventaja aporta la sobrecarga de métodos?
// Respuesta: ....................................................

