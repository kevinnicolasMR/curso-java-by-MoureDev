public class OperatorExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operaciÃ³n aritmÃ©tica.
        int a = 15;
        int b = 4;

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("=== OPERADORES ARITMÃ‰TICOS ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma: " + a + " + " + b + " = " + sum);
        System.out.println("Resta: " + a + " - " + b + " = " + subtraction);
        System.out.println("MultiplicaciÃ³n: " + a + " * " + b + " = " + multiplication);
        System.out.println("DivisiÃ³n: " + a + " / " + b + " = " + division);
        System.out.println("MÃ³dulo: " + a + " % " + b + " = " + modulus);

        // 2. Crea una variable para cada tipo de operaciÃ³n de asignaciÃ³n.
        System.out.println("\n=== OPERADORES DE ASIGNACIÃ“N ===");
        int x = 10;
        System.out.println("Valor inicial de x: " + x);

        x += 5;
        System.out.println("x += 5: " + x);

        x -= 3;
        System.out.println("x -= 3: " + x);

        x *= 2;
        System.out.println("x *= 2: " + x);

        x /= 4;
        System.out.println("x /= 4: " + x);

        x %= 3;
        System.out.println("x %= 3: " + x);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparaciÃ³n.
        System.out.println("\n=== COMPARACIONES VERDADERAS ===");
        System.out.println("10 == 10: " + (10 == 10));
        System.out.println("15 > 8: " + (15 > 8));
        System.out.println("5 <= 5: " + (5 <= 5));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparaciÃ³n.
        System.out.println("\n=== COMPARACIONES FALSAS ===");
        System.out.println("7 != 7: " + (7 != 7));
        System.out.println("3 >= 9: " + (3 >= 9));
        System.out.println("20 < 15: " + (20 < 15));

        // 5. Utiliza el operador lÃ³gico and.
        System.out.println("\n=== OPERADOR LÃ“GICO AND (&&) ===");
        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age >= 18 && hasLicense;
        System.out.println("Edad: " + age + ", Tiene licencia: " + hasLicense);
        System.out.println("Â¿Puede conducir? " + canDrive);

        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));

        // 6. Utiliza el operador lÃ³gico or.
        System.out.println("\n=== OPERADOR LÃ“GICO OR (||) ===");
        boolean isWeekend = true;
        boolean isVacation = false;
        boolean canRest = isWeekend || isVacation;
        System.out.println("Es fin de semana: " + isWeekend + ", Es vacaciones: " + isVacation);
        System.out.println("Â¿Puede descansar? " + canRest);

        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        // 7. Combina ambos operadores lÃ³gicos.
        System.out.println("\n=== COMBINANDO AND Y OR ===");
        int temperature = 25;
        boolean isSunny = true;
        boolean isRaining = false;

        boolean isGoodWeather = (temperature > 20 && isSunny) || !isRaining;
        System.out.println("Temperatura: " + temperature + "Â°C, Soleado: " + isSunny + ", Llueve: " + isRaining);
        System.out.println("Â¿Es buen clima? " + isGoodWeather);

        // Ejemplo con precedencia
        boolean result = true || false && false; // AND tiene precedencia sobre OR
        System.out.println("true || false && false: " + result);

        // 8. AÃ±ade alguna negaciÃ³n.
        System.out.println("\n=== OPERADOR DE NEGACIÃ“N (!) ===");
        boolean isRainingNow = false;
        boolean isNotRaining = !isRainingNow;
        System.out.println("EstÃ¡ lloviendo: " + isRainingNow);
        System.out.println("NO estÃ¡ lloviendo: " + isNotRaining);

        int number = 7;
        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;
        System.out.println("El nÃºmero " + number + " es par: " + isEven);
        System.out.println("El nÃºmero " + number + " es impar: " + isOdd);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("\n=== OPERADORES UNARIOS ===");
        int num = 5;

        // Positivo y negativo
        System.out.println("NÃºmero original: " + num);
        System.out.println("Positivo: " + (+num));
        System.out.println("Negativo: " + (-num));

        // Pre-incremento y post-incremento
        int counter = 10;
        System.out.println("Contador inicial: " + counter);
        System.out.println("Pre-incremento (++counter): " + (++counter));
        System.out.println("Post-incremento (counter++): " + (counter++));
        System.out.println("Valor final del contador: " + counter);

        // Pre-decremento y post-decremento
        int value = 8;
        System.out.println("Valor inicial: " + value);
        System.out.println("Pre-decremento (--value): " + (--value));
        System.out.println("Post-decremento (value--): " + (value--));
        System.out.println("Valor final: " + value);

        // 10. Combina operadores aritmÃ©ticos, de comparaciÃ³n y lÃ³gicos.
        System.out.println("\n=== COMBINANDO DIFERENTES OPERADORES ===");
        int price = 100;
        int discount = 15;
        boolean isVipClient = true;
        boolean isPurchaseOver50 = true;

        int discountedPrice = price - (price * discount / 100);
        boolean appliesExtraDiscount = isVipClient && isPurchaseOver50;
        int extraDiscount = appliesExtraDiscount ? 10 : 0;
        int finalPrice = discountedPrice - extraDiscount;

        System.out.println("Precio original: $" + price);
        System.out.println("Descuento: " + discount + "%");
        System.out.println("Es cliente VIP: " + isVipClient);
        System.out.println("Compra mayor a $50: " + isPurchaseOver50);
        System.out.println("Precio con descuento: $" + discountedPrice);
        System.out.println("Â¿Aplica descuento extra? " + appliesExtraDiscount);
        System.out.println("Precio final: $" + finalPrice);

        // Ejemplo complejo con mÃºltiples operadores
        int a1 = 10, b1 = 5, c1 = 3;
        boolean complexResult = (a1 + b1) > c1 * 4 && !(a1 % 2 == 0 && b1 < 10) || c1 != 3;
        System.out.println("\nOperaciÃ³n compleja:");
        System.out.println("a1=" + a1 + ", b1=" + b1 + ", c1=" + c1);
        System.out.println("(a1 + b1) > c1 * 4 && !(a1 % 2 == 0 && b1 < 10) || c1 != 3");
        System.out.println("Resultado: " + complexResult);
    }
}