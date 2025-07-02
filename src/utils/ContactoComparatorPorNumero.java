package utils;

    import java.util.Comparator;
    import models.Contacto;
    
    public class ContactoComparatorPorNumero implements Comparator<Contacto> {
        @Override
        public int compare(Contacto c1, Contacto c2) {
            int apellidocomparator = c1.getApellido().compareToIgnoreCase(c2.getApellido());
            if (apellidocomparator != 0) return apellidocomparator;
            int nombrecomparator = c1.getNombre().compareToIgnoreCase(c2.getNombre());
            if (nombrecomparator != 0) return nombrecomparator;
            int numerocomparator = c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
            if (numerocomparator != 0) return numerocomparator;
        return apellidocomparator;
    }
    }
    