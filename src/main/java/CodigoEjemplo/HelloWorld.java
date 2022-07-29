package CodigoEjemplo;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Bienvenidos al curso de automatización");
        String[] nombres;
        nombres = new String[]{"Eli", "Henry", "Alex", "Carmen", "Hermon", "Gabriel", "Joanna"};
        for (String nombre : nombres) {
            System.out.println(new ContructorMetodo(nombre));
        }
    }
}


