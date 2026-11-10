package VetCare;

public class Clinica implements Asegurable{
    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5_000_000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre;
    }
}
