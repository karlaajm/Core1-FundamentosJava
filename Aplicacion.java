import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        int numero = 4;
        boolean valor = Algoritmos.esPar(numero);
        System.out.println("¿El valor " + numero + " es par? R: " + valor);

        int numero2 = 17;
        boolean valor2 = Algoritmos.esPrimo(numero2);
        System.out.println("¿El valor " + numero2 + " es primo? R: " + valor2);

        String palabra = "severla";
        String palabraEnReversa = Algoritmos.stringEnReversa(palabra);
        System.out.println("La palabra asignada es *" + palabra + "* y la palabra en reversa es: " + palabraEnReversa);
        
        String frase = "anitalavalatina";
        boolean frasePalindromo = Algoritmos.esPalindromo(frase);
        System.out.println("¿La frase " + frase + " es palindromo? R: " + frasePalindromo);

        int numero3 = 15;
        Algoritmos.secuenciaFizzBuzz(numero3);
    }
}
