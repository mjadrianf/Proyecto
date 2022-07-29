package CodigoEjemplo;

class Estudiante {

    //intancia del metodo llamada estudiante
    public  void nombreEstudiante(String nombre){
        System.out.println("El nombre del estudiante: " + nombre);
    }

    public  void cursoEstudiante(int curso){
        System.out.println("El curso del estudiante es: " + curso );
    }
}

class InstanceMethod {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombreEstudiante("Henry");
        estudiante1.cursoEstudiante(5);
    }
}
