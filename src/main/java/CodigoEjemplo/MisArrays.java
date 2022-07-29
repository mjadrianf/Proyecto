package CodigoEjemplo;

public class MisArrays {
    public static void main(String[] args){
        String[] nombres;
        nombres = new String[]{"Eli", "Henry", "Alex", "Carmen", "Hermon", "Gabriel","Joanna"};
        int[] edades = new int[] {18, 20, 19, 17, 22, 21, 16};

        //System.out.println("El nombre del indice 0: " + nombres[0]);
       // System.out.println("La edad del indice 0: " + edades[0]);
        //System.out.println("El nombre del indice 1: " + nombres[1]);
       // System.out.println("La edad del indice 1: " + edades[1]);
        /*
        for(int i=0; i<10; i++){
            System.out.println("Numero de i es: " + i);
            for(int x=0; x<15; x++){
                System.out.println("Numero de x es: " + x);
            }
        }

         */
        int i = 10;
        while (i >= 0){
            System.out.println("el valor de i: " + i);
            i--;
        }

        int x = 10;
        do{
            System.out.println("el valor de x: " + x);
            x--;
        }while(x >= 0);
    }
}
