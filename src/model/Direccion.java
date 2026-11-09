package model;

/**
 * Esta clase representa la dirección registrada,
 * con sus respectivos atributos.
 */
public class Direccion {

    /**
     * Nombre de la calle
     */
    private String calle;
    /**
     * Número de la casa
     * Se deja como String, ya que hay numeraciones que comienzan con 0
     */
    private String numeroCasa;
    /**
     * Ciudad a la que pertenece
     */
    private String ciudad;
    /**
     * Comuna a la que pertenece
     */
    private String comuna;

    /**
     * Este es el constructor
     * Recibe los datos que se ingresen para cada atributo y se los asigna
     */
    public Direccion(String calle, String numeroCasa, String ciudad, String comuna) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.ciudad = ciudad;
        this.comuna = comuna;
    }

    /**
     * Estos son los getters y setters
     * con get transformamos en publicos los atributos de la clase Dirección
     * con set damos la opción de modificar un atributo
     */
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

    /**
     * Aquí se devuelven los datos de la Dirección formateados
     */
    @Override
    public String toString() {
        return calle + " " + numeroCasa + ", " + comuna + ", " + ciudad + "." ;
    }
}
