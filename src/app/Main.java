package app;

import model.Direccion;
import model.Persona;
import model.Empleado;


public class Main {

 
    public static void main(String[] args) {
        // Crear direcciones para utilizar mediante composicion.
        Direccion direccionCliente = new Direccion("Costanera 450", "Puerto Varas", "Los Lagos");
        Direccion direccionEmpleado = new Direccion("O'Higgins 123", "Llanquihue", "Los Lagos");
        Direccion direccionGuia = new Direccion("Los Volcanes 250", "Frutillar", "Los Lagos");

        // Crear al menos tres instancias de objetos.
        Persona cliente = new Persona("18799840-9", "Reiner Turra", direccionCliente);
        Empleado guia = new Empleado("98765432-1", "Agustina Chamorro", direccionEmpleado, "Guia de Montaña");
        Empleado administrativo = new Empleado("11222333-4", "Francisca Rodriguez", direccionGuia, "Secretaria");

        // Mostrar la informacion utilizando toString().
        System.out.println("=== SISTEMA AGENCIA DE TURISMO LLANQUIHUE TOUR ===");
        System.out.println("\n--- CLIENTE ---");
        System.out.println(cliente.toString());
        System.out.println("\n--- EMPLEADO 1 ---");
        System.out.println(guia.toString());
        System.out.println("\n--- EMPLEADO 2 ---");
        System.out.println(administrativo.toString());
    }
}
