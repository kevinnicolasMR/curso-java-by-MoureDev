public class DataTypes {

    public static void main(Strings[] args){

        // Primitive Data Types -- Datos con los que esta construida la base del codigo.

        int number = 10; // Numeros enteros
        System.out.println(number);

        double number2 = 10.1; // Numeros con decimales
        System.out.println(number2);
        // float, long, byte

        // char myChat = "a"; Definimos caracteres, pero con comilla simple

        boolean myBoolean = true; // True o false

        Strings myString = "Texto"; //Se suele decir que es primitvo por su usabilidad, pero en si es una class.

        // Como saber el tipo de dato?
        System.out.println(myString.getClass().getSimpleName()); // Para esto, al momento de definir el tipo, es necesario iniciar con mayuscula, en el casod e tratarse de un primitivo. Para agarrar su version chetada.




    }
}
