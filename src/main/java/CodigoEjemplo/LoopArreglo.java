package CodigoEjemplo;

public class LoopArreglo {
    public static void main(String[] args) {
        String[] nombres;
        nombres = new String[]{"Eli", "Henry", "Alex", "Carmen", "Hermon", "Gabriel", "Joanna"};
        int[] edades = new int[]{18, 20, 19, 17, 22, 21, 16};

        for(int i = 0; i < nombres.length; i++){
            System.out.println("El nombre del indice " + i + " : " + nombres[i]);
            if(nombres[i] == "Eli"){
                System.out.println("La eli tiene la culpa");
            }
        }

        for (int x : edades) {
            System.out.println(x + ",");
        }

    }
}
