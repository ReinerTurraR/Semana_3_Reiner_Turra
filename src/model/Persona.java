package model;


public class Persona {

    private String rut;
    private String nombre;
    private Direccion direccion;

    /** Crea una persona sin datos iniciales. */
    public Persona() {
    }

  
    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /** @return RUT de la persona */
    public String getRut() { return rut; }
    /** @param rut nuevo RUT */
    public void setRut(String rut) { this.rut = rut; }
    /** @return nombre de la persona */
    public String getNombre() { return nombre; }
    /** @param nombre nuevo nombre */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /** @return direccion de la persona */
    public Direccion getDireccion() { return direccion; }
    /** @param direccion nueva direccion */
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    /** @return informacion de la persona */
    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
