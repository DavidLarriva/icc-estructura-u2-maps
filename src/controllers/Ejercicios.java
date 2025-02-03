package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        //throw new UnsupportedOperationException("Not implemented yet");


        // si las palabras no tienen la misma longitud, no pueden ser anagramas
      if (str1.length() != str2.length()) return false;

      // creamos un hashMap para contar cuantas veces aparece cada letra en str1
      Map<Character, Integer> freqMap = new HashMap<>();

      // recorremos str1 y guardamos la frecuencia de cada letra en el hashMap
      for (char c : str1.toLowerCase().toCharArray()) {
         freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
      }

      // recorremos str2 y vamos restando las frecuencias de cada letra en el hashMap
      for (char c : str2.toLowerCase().toCharArray()) {
         // si la letra no esta en el hashMap, significa que str2 tiene una letra diferente, entonces no es anagrama
         if (!freqMap.containsKey(c)) return false;

         // restamos 1 a la frecuencia de la letra
         freqMap.put(c, freqMap.get(c) - 1);

         // si la frecuencia de la letra llega a 0, la eliminamos del hashMap
         if (freqMap.get(c) == 0) {
            freqMap.remove(c);
         }
        }

        // si el hashMap esta vacio al final, significa que ambas palabras tienen las mismas letras con la misma frecuencia
      return freqMap.isEmpty();
    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {

        //primero creamos un hashMap que se llama hmap donde vamos a guardar numeros que ya hemos visto y su índice correspondiente

        Map<Integer, Integer> hmap = new HashMap<>(); 

        //bucle for donde recorremos todo el arreglo de nums 
        for (int i = 0; i < nums.length; i++) {
            //Definimos un int llamado complemento, esto nos sirve para saber que si complemento se encuentra en hmap pues tendríamos una respuesta
        int complemento = objetivo - nums[i]; 

        if (hmap.containsKey(complemento)) { 
            //si hmap contiene complemento entonces se retorna el indice, con hmap.get se retorna la posición de complemento y aparte i que sería la otra posición
         return new int[]{hmap.get(complemento), i};
        }

        //se coloca en el mapa el numero y su indice para despues buscarlo con containsKey 

        hmap.put(nums[i], i); 
   }

   //Retorna null si no encuentra nadota 

   return null; 
    }
}
