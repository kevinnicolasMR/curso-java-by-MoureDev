public class Strings {
    public static void main(String[] args){
        String name = "kevin";
        //var surname = new String(original:original);
        //Es mejor aclarar en un inicio de que tipo es la variable.

        // Concatención
        System.out.println(name + "" + "Medina");

        // Funcion Length: obtener la longitud o cantidad de letras
        System.out.println(name.length());

        // Obtener caracteristicas
        System.out.println(name.charAt(1));

        //SubString Te permite sacar partes de una cadena de texto
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));

        // toUpperCase y toLowerCase
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Comprobar si contiene
        System.out.println("Verdadero o falso:" + "" + "Kevin Medina".contains("Raul"));
        System.out.println("Kevin Medina".contains("KE")); // Falso
        System.out.println("Kevin".toUpperCase().contains("KE")); // true

        // Comparación En Java no se usa == para strings, sino un method
        System.out.println(name.equals("Pedro"));
        System.out.println(name.equalsIgnoreCase("KEVIN"));

        //Trim Elimina espacios en blanco al inicio y final de la oración
        System.out.println(" Hola, me llamo Kevin ".trim());

        // Replace
        System.out.println(" Hola, me llamo Kevin ".replace(" ",""));

        // Format
        int age = 62;
        System.out.println(String.format("Mi nombre es %s y tengo %d años", name, age));






    }
}
