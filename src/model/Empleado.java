package model;

public class Empleado extends Persona{
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, int edad, Direccion direccion, String contacto, String cargo, double sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, rut, edad, direccion, contacto);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo:     " + cargo +
                "\nSueldo:    $" + String.format("%,.0f", sueldo).replace(",", ".");
    }
}
