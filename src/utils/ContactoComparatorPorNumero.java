package utils;

    import java.util.Comparator;
    import models.Contacto;
    
    public class ContactoComparatorPorNumero implements Comparator<Contacto> {
        @Override
        public int compare(Contacto c1, Contacto c2) {
 
        //compara el número de teléfono en descendente
        int telefonoComparison = c2.getTelefono().compareTo(c1.getTelefono());
        if (telefonoComparison != 0) {
            return telefonoComparison;
        }

        return 0;
    }
    }
    