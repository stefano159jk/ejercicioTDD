package service;

import java.text.Normalizer;

public class PalindromoService {

    public boolean esPalindromo(String texto) {
        // Normaliza el texto para eliminar tildes
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        // Elimina espacios, signos de puntuación y convierte a minúsculas
        String textoLimpio = textoNormalizado.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Compara el texto limpio con su reverso
        String reverso = new StringBuilder(textoLimpio).reverse().toString();

        return textoLimpio.equals(reverso);
    }
}
