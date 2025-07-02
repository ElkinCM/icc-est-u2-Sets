package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto [" +
                "nombre = " + nombre + '\'' +
                ", apellido = '" + apellido + '\'' +
                ", telefono = '" + telefono + '\'' +
                ']';
    }
    //@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre) &&
               apellido.equals(contacto.apellido) &&
               telefono.equals(contacto.telefono);
    }
    //@Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        result = 31 * result + telefono.hashCode();
        return result;
    }

    
    
}
