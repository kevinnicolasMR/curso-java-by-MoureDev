public class condicionales {
    public static void main(String[] args){
        // Condicionales:
        var age = 2;

        if(age >= 18){
            System.out.println("El usuario tiene " + age + " Por lo tanto es mayor de edad");
        }else{
            System.out.println("El usuario tiene " + age + " Es menor de edad");
        }

        // Switch: Partiendo de una variable, establecemos posibles resultados

        var day = 5;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break; // Cerrar el bucle en caso de ser correcto
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("No es un dia interesante");

        }
    }

}
