package Controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tiempoDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tiempoDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("Ejercicio 2");
        System.out.println(("Muercielago es un isograma = "+ esIsograma("Murcielago")));
        System.out.println(("Camaleon es un isograma = "+ esIsograma("Camaleón")));
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 3");
        String texto = "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades.";
        System.out.println("Contador de palabras unicas : " + contarPalabrasUnicas(texto));

    }
    public boolean tiempoDuplicados (int[] numeros) {
        //Uso del mejor set para comprobar si hay duplicados
        Set<Integer> set = new HashSet<>();
        for (int numero : numeros) {
            if(!set.add(numero)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> set = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            //Ignorar espacios y caracteres especiales
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (!set.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        Set<String> palabrasUnicas = new HashSet<>();
        int contador = 0;
        String[] palabras = frase.split("\\W+"); // Dividir por espacios y signos de puntuación
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                if (palabrasUnicas.add(palabra.toLowerCase())) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
