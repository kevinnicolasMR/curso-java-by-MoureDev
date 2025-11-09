package Course.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructresExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] valores = {
                "kevin",
                "Medina",
                "Robles",
                "Nicolas",
                "Ana Laura"
        };
        System.out.println("longitud:" + valores.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del Ã­ndice antes
        // y despuÃ©s de modificarlo.
        System.out.println("Antes: " + valores[1]);
        valores[1] = "Goku";
        System.out.println("Despues: " + valores[1]);

        // 3. Crea un ArrayList vacÃ­o.
        ArrayList <Integer> numbers = new ArrayList<Integer>();

        // 4. AÃ±ade 4 valores al ArrayList y elimina uno a continuaciÃ³n.
        System.out.println("-------------------------------");
        System.out.println("ArrayList: " + numbers.size());

        numbers.add(1);
        numbers.add(23);
        numbers.add(4);
        numbers.add(15);
        System.out.println("ArrayListAdd: " + numbers.size());
        numbers.remove(1);
        System.out.println("ArrayListDelete: " + numbers.size());


        // 5. Crea un HashSet con 2 valores diferentes.
        //HashSet<String> namesSet = new HashSet<String>();
        var namesSet = new HashSet<String>();
        namesSet.add("Kevin");
        namesSet.add("Ana");

        System.out.println(namesSet);

        // 6. AÃ±ade un nuevo valor repetido y otro sin repetir al HashSet.
        namesSet.add("Kevin"); // No se repite
        namesSet.add("Lucia");
        System.out.println(namesSet);

        // 7. Elimina uno de los elementos del HashSet.
        namesSet.remove("Ana");
        System.out.println(namesSet);
        namesSet.clear();


        // 8. Crea un HashMap donde la clave sea un nombre y el valor el nÃºmero de
        // telÃ©fono. AÃ±ade tres contactos.
        HashMap<String,Integer> contactList = new HashMap<>();
        contactList.put("Kevin", 2222);
        contactList.put("Ana", 32222);

        System.out.println(contactList);

        // 9. Modifica uno de los contactos y elimina otro.
        contactList.replace("Kevin", 1236);
        contactList.remove("Ana");
        System.out.println(contactList);



        // 10. Dado un Array, transfÃ³rmalo en un ArrayList, a continuaciÃ³n en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        System.out.println("Array:" + valores);
        var km = Arrays.stream(valores).toList();
        System.out.println("ArrayList: "+ km);

        System.out.println("Set Vacio: "+namesSet);
        namesSet.add(km.get(0));
        namesSet.add(km.get(1));
        namesSet.add(km.get(2));
        namesSet.add(km.get(3));
        namesSet.add(km.get(4));

        System.out.println("Set: "+namesSet);

        // Ahora de Set a Map:
        var mapaUsuarios = new HashMap<Integer,String>();
        System.out.println(mapaUsuarios);

        //mapaUsuarios.put(1,namesSet.contains("Kevin"));
        System.out.println(namesSet.contains("Goku"));




    }
}