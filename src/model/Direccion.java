package model;

public class Direccion {

    private String calle;
    private String numeroCasa;
    private String ciudad;
    private String comuna;

    public Direccion(String calle, String numeroCasa, String ciudad, String comuna) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.ciudad = ciudad;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return calle + " " + numeroCasa + ", " + comuna + ", " + ciudad + "." ;
    }
}
