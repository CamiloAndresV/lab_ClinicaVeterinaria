package VetCare;

public class Main {
    public static void main (String[] args) {
        Animal[] animales = new Animal[] {
                new Perro("Toby", 4, "Edison", "Pitbull"),
                new Gato("Michi", 2, "Ana", true),
                new Ave("Pico", 1, "Sofia", 150.0)
        };

        for (Animal animal: animales) {
            animal.imprimirFicha();
        }

        Perro perroPrueba = new Perro("Firulais", 3, "Pedro", "Beagle");
        Gato gatoPrueba = new Gato("Garfield", 5, "Laura", false);
        //Ave avep = new Ave("fi", 4, "juan", 120);

        perroPrueba.registrarVacuna("Rabia");
        perroPrueba.registrarVacuna("Multiple");
        gatoPrueba.registrarVacuna("Leucemia felina");
        //avep.registrarVacuna("Leucemia felina");

        System.out.println(perroPrueba.nombre + " tiene " + perroPrueba.getVacunasAplicadas() + " vacunas");
        System.out.println(gatoPrueba.nombre + " tiene " + gatoPrueba.getVacunasAplicadas() + " vacunas");

        Asegurable[] asegurables = new Asegurable[]{
                perroPrueba,
                gatoPrueba,
                new Clinica("VetCare Central", "Calle 123")
        };

        for (Asegurable elemento : asegurables) {
            System.out.println("Póliza: " + elemento.obtenerNumeroPoliza()
                    + " | Prima Anual: $" + elemento.calcularPrimaSeguro());
        }

        Animal nuevoanimal = new Conejo("Julian", 3, "Carmenza");
        nuevoanimal.imprimirFicha();

        };
    }
