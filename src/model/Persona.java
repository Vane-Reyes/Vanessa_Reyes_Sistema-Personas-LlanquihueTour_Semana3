package model;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rut;
    private int edad;
    private Direccion direccion;
    private String contacto;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, int edad, Direccion direccion, String contacto) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.edad = edad;
        this.direccion = direccion;
        this.contacto = contacto;
    }

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

    @Override
    public String toString() {
        return "Nombre:    " + nombre + " " + apellidoPaterno + " " + apellidoMaterno +
                "\nRUT:       " + rut +
                "\nEdad:      " + edad +
                "\nDirección: " + direccion +
                "\nContacto:  " + contacto;
    }

}


