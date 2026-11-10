package VetCare;

public class Conejo extends Animal{

    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    @Override
    public double costoConsulta() {
        return 35_000;
    }
}
