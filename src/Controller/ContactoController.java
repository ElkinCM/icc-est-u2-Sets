package Controller;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorPorNumero;

import java.util.Set;
import java.util.TreeSet;

public class ContactoController {

    public ContactoController() {
        System.out.println("Nombres");
        runTreeContacto();
        System.out.println("Telfonos");
        runTreeContactoconNumero();
    }

    private void runTreeContacto() {
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> contactos = new TreeSet<>(contactoComparator);    
    
        // Agregar contactos a ambos conjuntos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for(Contacto contacto : contactos){
            System.out.println(contacto);}
        }

        private void runTreeContactoconNumero() {
        ContactoComparatorPorNumero contactoComparatorPorNumero = new ContactoComparatorPorNumero();
        Set<Contacto> contactos = new TreeSet<>(contactoComparatorPorNumero);    
    
        // Agregar contactos a ambos conjuntos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for(Contacto contacto : contactos){
            System.out.println(contacto);
        }


    }
    
    
}
