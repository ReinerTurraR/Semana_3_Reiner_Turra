package model;


public class Empleado extends Persona {

    private String cargo;

    /** Crea un empleado con sus datos personales y cargo. */
    public Empleado() {
        super();
    }

    public Empleado(String rut, String nombre, Direccion direccion, String cargo) {
        super(rut, nombre, direccion);
        this.cargo = cargo;
    }

    /** @return cargo del empleado */
    public String getCargo() { return cargo; }
    /** @param cargo nuevo cargo */
    public void setCargo(String cargo) { this.cargo = cargo; }

    /** @return datos personales y cargo del empleado */
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo;
    }
}
