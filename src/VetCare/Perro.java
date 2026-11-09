package VetCare;

public class Perro extends Animal {

    public String raza;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double costoConsulta() {
        return 45_000 + (3_000 * edad);
    }

}