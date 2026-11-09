package VetCare;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public abstract double costoConsulta(); //varia segun la especie, cada subclase debe escribir su propia logica

    public void imprimirFicha() {
        //return "nombre: "+ nombre + "edad: "+ edad + "dueño: " + nombreDueno + "costo: " + costoConsulta();
        System.out.println("----- FICHA VETERINARIA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo Consulta: $" + costoConsulta());
        System.out.println("-----------------------------");
    }
}
