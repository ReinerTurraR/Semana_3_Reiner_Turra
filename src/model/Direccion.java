package model;


public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    /** Crea una direccion vacia. */
    public Direccion() {
    }

 
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    /** @return calle y numero */
    public String getCalle() { return calle; }
    /** @param calle nueva calle y numero */
    public void setCalle(String calle) { this.calle = calle; }
    /** @return ciudad */
    public String getCiudad() { return ciudad; }
    /** @param ciudad nueva ciudad */
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    /** @return region */
    public String getRegion() { return region; }
    /** @param region nueva region */
    public void setRegion(String region) { this.region = region; }

    /** @return datos de la direccion en formato legible */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", region=" + region + '}';
    }
}
