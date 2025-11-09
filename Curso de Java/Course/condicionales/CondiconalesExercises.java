package Course.condicionales;

public class CondiconalesExercises {
    public static void main(String[] args) {
        int userAge = 18;

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).
        if(userAge >= 18){
            System.out.println("Puede votar");
        }else{
            System.out.println("no puede votar");
        }

        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.
        int a=1;
        int b=2;
        if(a>b){
            System.out.println("A es mayor a B");
        } else if (a == b) {
            System.out.println("A y B son igualees");
        }else{
            System.out.println("B es mayor a A");
        }


        // 4. Crea un programa que diga si un nÃºmero es par o impar.
        int numb = 3;
        if (numb % 2 == 0){
            System.out.println("El numero es par?");
        }else{
            System.out.println("No es par");
        }

        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.
        if(numb >= 1 && numb <= 100){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }

        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.
        int day = 2;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Pusiste mal el numero del dia, solo se admiten del 1-7");

        }

    }
}
