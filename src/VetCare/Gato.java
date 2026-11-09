package VetCare;

public class Gato extends Animal {
    public boolean esEsterilizado;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double costoConsulta() {
        return 38_000;
    }
}

