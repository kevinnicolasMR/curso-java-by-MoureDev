package Course.structure;

import java.util.ArrayList;

public class DataSctructres {
  public static void main(String[] args){

      // Array
      int[] numbers = new int[3];
      System.out.println(numbers.length);

      String[] names = {
              "Kevin",
              "Ana",
              "Claudia"
      };
      System.out.println(names);

      // Acceso

      System.out.println(numbers[0]);
      System.out.println(names[0]);

      System.out.println((new String[3])[0]);

      // Modificacion:
      numbers[0] = 1;
      numbers[1] = 10;
      System.out.println(numbers[0]);
      System.out.println(numbers[1]);

      names[0] = null;
      System.out.println(names[0]);

//------------------ List ------------------------/

      // Declaraciones y creacion

      ArrayList<String> namesArray = new ArrayList<>();
      var numberArray = new ArrayList<Integer>();
      System.out.println("Aca inician las listas");
      System.out.println(numberArray.size());

      // Create

      namesArray.add("Kevin");
      System.out.println(namesArray.size());
      namesArray.add("Medina");
      System.out.println(namesArray.size());

      // Acces
      System.out.println(namesArray.getFirst());
      System.out.println(namesArray.getLast());

      namesArray.add("Pedro");

      System.out.println(namesArray.get(1));
      System.out.println(namesArray.getLast());

      // Edit

      namesArray.set(1,"Robles");
      System.out.println(namesArray.get(1));
      System.out.println(namesArray.size());

      // Delete

      namesArray.remove(2);
      System.out.println(namesArray.size());

      // Search

      System.out.println(namesArray.contains("Kevin"));

      // Delet all

      namesArray.clear();
      System.out.println(namesArray.size());



  }
}
