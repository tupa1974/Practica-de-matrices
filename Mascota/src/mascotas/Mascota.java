package mascotas;

public class Mascota {

    /*
     Crear una clase Mascota, que tenga los siguientes atributos: nombre,
     especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos,
     constructores y métodos getters y setters).
     */
    private String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;

    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
	this.nombre = nombre;
	this.especie = especie;
	this.sexo = sexo;
	this.color = color;
	this.pelaje = pelaje;
	this.raza = raza;
    }

    public Mascota() {
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getEspecie() {
	return especie;
    }

    public void setEspecie(String especie) {
	this.especie = especie;
    }

    public String getSexo() {
	return sexo;
    }

    public void setSexo(String sexo) {
	this.sexo = sexo;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public String getPelaje() {
	return pelaje;
    }

    public void setPelaje(String pelaje) {
	this.pelaje = pelaje;
    }

    public String getRaza() {
	return raza;
    }

    public void setRaza(String raza) {
	this.raza = raza;
    }

    @Override
    public String toString() {
	return "\nNombre = " + nombre + 
	    ", \nEspecie = " + especie + 
	    ", \npelaje = " + pelaje +
	    "\n";
    }

}
