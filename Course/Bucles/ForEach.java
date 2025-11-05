package Course.Bucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ForEach {
    public static void main(String[] args){
        // For each
        String[] newArray = {"Kevin", "Medina", "Robles", "Nicolas", "Pedro"};

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

        //-------------------------------------
        System.out.println("--------------");
//El for each es para no enfocarse en el index, definimos una variable x
        //Esta variable x recorre el bucle por cada elemento que encuentre en el array

        for (String name: newArray){
            System.out.println(name);
        }

        System.out.println("--------------");
        var newSets = new HashSet<String>();
        newSets.add("Kevin");
        newSets.add("Nicolas");
        newSets.add("Medina");
        newSets.add("Robles");
        System.out.println(newArray);

        for (String newSet: newSets){
            System.out.println(newSet);
        }

        System.out.println("--------------");

        var emails = new HashMap<Integer, String>();
        emails.put(0,"kevinnicolasmr@gmail.com");
        emails.put(1,"Raul@gmail.com");
        emails.put(2,"Nicolasmr@gmail.com");
        emails.put(3,"kevin@gmail.com");
        System.out.println(emails);

        for (Map.Entry<Integer,String> email: emails.entrySet()){
            System.out.println(email.getKey());
            System.out.println(email.getValue());
            System.out.println("-------------");
        }

    }
}
