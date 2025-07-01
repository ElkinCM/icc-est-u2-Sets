package Controller;

import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop"); 

        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> Lista = new LinkedHashSet<>();
        Lista.add("Laptop");
        Lista.add("Manzana");
        Lista.add("Pera");
        Lista.add("Celular");
        Lista.add("Laptop");
        Lista.add("Pera");
        Lista.add("Laptop");

        return Lista;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador() {

        Comparator <String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compara las longitudes de las cadenas
                int resultado = Integer.compare(s1.length(), s2.length());
                // Si las longitudes son iguales, compara alfabéticamente
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };
    
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet;

    }

    
    public Set<String> construirTreeSetConComparador2() {

        Comparator <String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compara las longitudes de las cadenas
                int resultado = Integer.compare(s2.length(), s1.length());
                // Si las longitudes son iguales, compara alfabéticamente en orden inverso
                if (resultado == 0) {
                    resultado = s2.compareTo(s1);
                }
                return resultado;
            }
        };
    
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet;

    }
    
    
}
