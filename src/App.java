
import Controller.ContactoController;
import Controller.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        /*runHaashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparador2(sets);*/
        System.out.println("Elkin Chamba ");
        ContactoController contactoController = new ContactoController();
        
    }

    
    public static void runHaashSet(Sets sets) {
        System.out.println("--- HashSet ---");
        System.out.println("Elementos del HashSet (No se garantiza el orden):");
        for (String palabra : sets.construirHashSet()) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        System.out.println("--- LinkedHashSet ---");
        System.out.println("Elementos del LinkedHashSet (Mantiene el orden de inserción):");
        for (String Lista : sets.construirLinkedHashSet()) {
            System.out.println(Lista);
        }
    }

    public static void runTreeSet(Sets sets) {
        System.out.println("--- TreeSet ---");
        System.out.println("Elementos del TreeSet (Ordenados alfabéticamente):");
        for (String miTreeSet : sets.construirTreeSet()) {
            System.out.println(miTreeSet);
        }
    }

    public static void runTreeSetConComparador(Sets sets) {
        System.out.println("--- TreeSet con Comparador ---");
        System.out.println("Elementos del TreeSet (Ordenados Alfabéticamente):");
        for (String miTreeSet : sets.construirTreeSetConComparador()) {
            System.out.println(miTreeSet);
        }
    }

    public static void runTreeSetConComparador2(Sets sets) {
        System.out.println("--- TreeSet con comparador (orden inverso alfabético si longitud igual) ---");
        for (String elemento : sets.construirTreeSetConComparador2()) {
            System.out.println(elemento);
        }
    }
}
