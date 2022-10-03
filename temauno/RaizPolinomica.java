package dam.temauno;

/**
 * Clase para realizar ecuaciones
 * de segundo grado
 * @author jose
 */
public class RaizPolinomica {
    public static void main(String[] args) {
        // Inicialización de las variables a, b y c, con sus respectivos valores
        double a = 10, b = 6, c = 1;

        // Inicialización del discriminante de la ecuación de segundo grado
        double discriminante = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        // Inicialización de la variable x1 que contendrá la primera solución
        double x1 = (-b + discriminante) / (2 * a);
        // Inicialización de la variable x2 que contendrá la segunda solución
        double x2 = (-b - discriminante) / (2 * a);

        // Si el discriminante es mayor a 0, tiene dos soluciones
        if (discriminante > 0) {
            System.out.println("Existen dos soluciones");
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
        // Si el discriminante es igual a 0, solo tiene una solución
        } else if (discriminante == 0) {
            System.out.println("Solo existe una solución");
            System.out.println("Solución: " + x1);
        // Si no es ninguna de las condiciones anteriores, tiene dos soluciones complejas
        } else {
            System.out.println("Existen soluciones complejas");
        }
    }
}
