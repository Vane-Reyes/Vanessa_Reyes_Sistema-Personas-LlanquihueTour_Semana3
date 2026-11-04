package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        //DIRECCIONES
        Direccion direccion1 = new Direccion("La Patagua", "62", "Pomaire", "Melipilla");

        Direccion direccion2 = new Direccion("Príncipe de Gales", "7520", "La Reina", "Santiago");

        //PERSONAS
        Persona persona1 =  new Persona("Vanessa", "Reyes", "González", "12345678-9", 31, direccion1, "931931189");

        Persona persona2 = new Persona("Andrés", "Müller", "Díaz", "10987654-2", 43, direccion2, "912345678");

        //EMPLEADOS
        Empleado empleado1 = new Empleado (persona1.getNombre(), persona1.getApellidoPaterno(), persona1.getApellidoMaterno(), persona1.getRut(), persona1.getEdad(), direccion1, persona1.getContacto(), "Guía Turístico", 1200000);

        System.out.println("\n=========== REGISTRO DE PERSONAS - LLANQUIHUE TOUR ===========\n");

        System.out.println("--- Persona ---");
        System.out.println(persona2 + "\n");
        System.out.println(persona1);

        System.out.println("\n--- Empleado ---");
        System.out.println(empleado1);
    }
}
