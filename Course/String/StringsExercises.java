public class StringsExercises {
    public static void main(String[] args) {

        String name = "Kevin Medina";
        int age = 25;
        String frase = " Hace años que no visito Durazno ";

        // 1. Concatena dos cadenas de texto
        System.out.println("Hola, me llamo " + name);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Mi nombre tiene: " + name.length() + " Letras" );

        // 3. Muestra el primer y Ãºltimo carÃ¡cter de un string.
        System.out.println("Primer caracter " + name.substring(0,1) + " y segundo caracter: " + name.substring(4,5));

        // 4. Convierte a mayÃºsculas y minÃºsculas un string.
        System.out.println(name.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(frase.contains("visito"));

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Mi nombre es %s", name));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(frase.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).
        System.out.println(frase.replace(" ", "-"));


        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(frase));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(frase.length() == name.length());
    }
}
