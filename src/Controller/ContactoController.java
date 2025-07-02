package Controller;

import models.Contacto;

import java.util.Set;
import java.util.TreeSet;

public class ContactoController {

    public ContactoController() {
        runTreeContacto();
    }

    private void runTreeContacto() {
        // TreeSet con ContactoComparator (orden por apellido, nombre y teléfono)
        Set<Contacto> contactosPorApellido = new TreeSet<>(new utils.ContactoComparator());
        // TreeSet con ContactoComparatorPorNumero (orden por número de teléfono)
        Set<Contacto> contactosPorNumero = new TreeSet<>(new utils.ContactoComparatorPorNumero());
    
        // Agregar contactos a ambos conjuntos
        contactosPorApellido.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactosPorApellido.add(new Contacto("Luis", "Perez", "111111111"));
        contactosPorApellido.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactosPorApellido.add(new Contacto("Ana", "Perez", "987654321"));
        contactosPorApellido.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactosPorApellido.add(new Contacto("Pedro", "Lopez", "123456789"));
    
        contactosPorNumero.addAll(contactosPorApellido);
    
        // Imprimir contactos ordenados por apellido, nombre
        System.out.println("Contactos ordenados por apellido, nombre y teléfono:");
        for (Contacto contacto : contactosPorApellido) {
            System.out.println(contacto);
        }
    
        // Imprimir contactos ordenados por número de teléfono
        System.out.println("\nContactos ordenados por número de teléfono:");
        for (Contacto contacto : contactosPorNumero) {
            System.out.println(contacto);
        }
    }
    
}
