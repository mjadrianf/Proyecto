package CodigoEjemplo;

class Vehiculo {
    String marca;
    String modelo;
    int año;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(String nissan) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Vehiculo(String marca, String modelo, int año){
        this.marca =  marca;
        this.modelo = modelo;
        this.año = año;
    }
    public void asignarVehiculo(){
        System.out.println("Asignacion de vehiculo");
    }

}

public class ConstructorModeloVehiculo{
    public static void main(String[] args) {
        Vehiculo Nissan = new Vehiculo("Nissan", "v16", 2022);
        Nissan.asignarVehiculo();
        Nissan.getModelo("Nissan");
    }

}

