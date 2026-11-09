package model;

/**
 * Esta clase representa al empleado registrado
 * con sus respectivos atributos.
 */
public class Empleado extends Persona{
    private String cargo;
    private double sueldo;

    /**
     * Este es el constructor
     * Recibe los datos que se ingresen para cada atributo y se los asigna
     */
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, int edad, Direccion direccion, String contacto, String cargo, double sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, rut, edad, direccion, contacto);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     * Estos son los getters y setters
     * con get transformamos en publicos los atributos de la clase Empleado
     * con set damos la opción de modificar un atributo
     */
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

    /**
     * Aquí se devuelven los datos del empleado formateados
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nCargo:     " + cargo +
                "\nSueldo:    $" + String.format("%,.0f", sueldo).replace(",", ".");
    }
}
