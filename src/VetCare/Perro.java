package VetCare;

import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;
    private List<String> vacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public double costoConsulta() {
        return 45_000 + (3_000 * edad);
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80_000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombre;
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