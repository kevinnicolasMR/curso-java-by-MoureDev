public class VariablesAndConstants{
    public static void main(String[] args){
        // Variables
        String name = "Kevin";
        System.out.println(name);

        name = "Medina";
        System.out.println(name);
        // name = 10; (No podemos cambiar el tipo de dato a una variable.

        int age = 24;
        System.out.println(age);

        // Constants

        final String EMAIL = "kevinnicolasmr@gmail.com";
        // email = "email"; (Las constantes no se modifican)
        System.out.println(EMAIL);

        var pass = "My password"; // El tipo de la variable se define automaticamente usando var. Esto se llama inferencia de tipos, el lenguaje detecta automaticamente el tipo.



    }
}
