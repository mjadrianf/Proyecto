package CodigoEjemplo;

public class Metodo {
    public static void main(String[] args) {
        String[] nombres;
        nombres = new String[]{"Eli", "Henry", "Alex", "Carmen", "Hermon", "Gabriel", "Joanna"};
        for (String nombre : nombres) {
            System.out.println("El resultado es: " + isNombre(nombre));
        }
    }

    public static void saludar(String nombre){
        System.out.println("Hola estimado: " + nombre);
    }

    public static boolean isNombre(String nombre){
        if (nombre == "Eli") {
            return true;
        }
        return false;
    }

    public static String fraseBienvenida(String nombre){
        return ("Hola querido " + nombre + " gracias por venir");
    }

    public static double sumar(double num1, double num2){
        double suma = num1 + num2;
        return suma;
    }

}

