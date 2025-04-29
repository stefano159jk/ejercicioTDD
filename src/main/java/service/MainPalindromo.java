package service;

import java.util.Scanner;

public class MainPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromoService service = new PalindromoService();

        System.out.println("Ingrese una frase para verificar si es un palíndromo:");
        String texto = scanner.nextLine();

        boolean resultado = service.esPalindromo(texto);

        if (resultado) {
            System.out.println("✅ Es un palíndromo.");
        } else {
            System.out.println("❌ No es un palíndromo.");
        }

        scanner.close();
    }
}
