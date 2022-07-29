package CodigoEjemplo;

public class ifElseEjemplo {
    public static void main(String[] args) {
        /*
        int x = 0;
        if (x < 0){
            System.out.println("Numero negativo");
        } else if (x > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("igual a cero");
        }
    }*/
        String curso = "null";
        switch(curso){
            case "primero":
                System.out.println("esta en primero");
                break;
            case "segundo":
                System.out.println("esta en segundo");
                break;
            case "tercero":
                System.out.println("esta en tercero");
                break;
            case "cuarto":
                System.out.println("esta en cuarto");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + curso);
        }
    }
}
