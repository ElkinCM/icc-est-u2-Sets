package utils;
import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero compara apellido por orden alfabético
        int apellidoComparison = c1.getApellido().compareTo(c2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        }
        // Si los apellidos son iguales, compara nombre por orden alfabético
        int nombreComparison = c1.getNombre().compareTo(c2.getNombre());
        if (nombreComparison != 0) {
            return nombreComparison;
        }
        return 0;
    }
}
