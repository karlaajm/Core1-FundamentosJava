package clases;

public class Algoritmos {
    public static boolean esPar(int num){
        return (num % 2 == 0)? true : false;
    }

    public static boolean esPrimo(int num){
        boolean msg = true;
        if(num == 2 || num == 3) {
            return msg;
        }
        if(num % 2 == 0 || num % 3 == 0) {
            return !msg;
        } else {
            return msg;
        }
    }

    public static String stringEnReversa(String palabra){
        String nuevaPalabra = "";
        for(int i = (palabra.length() - 1); i >= 0; i--){
            nuevaPalabra = nuevaPalabra + palabra.charAt(i);
        }
        return nuevaPalabra;
    }

    public static boolean esPalindromo(String palabra){
        String nuevaPalabra = "";
        for(int i = (palabra.length() - 1); i >= 0; i--){
            nuevaPalabra = nuevaPalabra + palabra.charAt(i);
        }
        if(nuevaPalabra.equals(palabra)){
            return true;
        } else {
            return false;
        }
    }

    public static void secuenciaFizzBuzz(int numero){
        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
