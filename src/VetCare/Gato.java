package VetCare;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private List<String> vacunas;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new ArrayList<>();
    }

    @Override
    public double costoConsulta() {
        return 38_000;
    }

    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120_000;
        } else {
            return 200_000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombre;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }
}

