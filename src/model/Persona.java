package model;

/**
 * Esta clase representa la persona registrada,
 * con su nombre, apellido materno, paterno, rut, edad, dirección y número de contacto.
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Apellidos de la persona
     */
    private String apellidoPaterno;
    private String apellidoMaterno;
    /**
     * RUT de la Persona
     * Se deja como String porque dependiendo del digito verificador del rut, puede terminar en K
     */
    private String rut;
    /**
     * Edad de la persona
     */
    private int edad;
    /**
     * Dirección de la persona
     */
    private Direccion direccion;
    /**
     * Número de la Persona
     * Se deja como String porque dependiendo del código de región, puede empezar con 0
     */
    private String contacto;

    /**
     * Este es el constructor
     * Recibe los datos que se ingresen para cada atributo y se los asigna
     */
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, int edad, Direccion direccion, String contacto) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.edad = edad;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    /**
     * Estos son los getters y setters
     * con get transformamos en publicos los atributos de la clase Persona
     * con set damos la opción de modificar un atributo
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Aquí se devuelven los datos de la Persona formateados
     */
    @Override
    public String toString() {
        return "Nombre:    " + nombre + " " + apellidoPaterno + " " + apellidoMaterno +
                "\nRUT:       " + rut +
                "\nEdad:      " + edad +
                "\nDirección: " + direccion +
                "\nContacto:  " + contacto;
    }

}


