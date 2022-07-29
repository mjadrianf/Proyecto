package CodigoEjemplo;

public class Perro {

    public static void main(String[] args){
        definir_tipo("Beagle");
        nombrar_al_perro("Floppy");

    }

    public static void nombrar_al_perro(String nombre){
        System.out.println("El nombre del perro es : "+ nombre);
    }

    public static void definir_tipo(String raza){

        switch(raza){
            case "Beagle": System.out.println("El tipo de perro es : Hound");
                break;
            case "Weish Terrier": System.out.println("El tipo de perro es : Terrier ");
                break;
            case "Toy Poodle": System.out.println("El tipo de perro es :  Poodle");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + raza);
        }
    }
}
