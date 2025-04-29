package service;

import org.junit.Assert;
import org.junit.Test;


public class PalindromoServiceTest {

    @Test
    public void testEsPalindromo() {
        PalindromoService service = new PalindromoService();

        Assert.assertTrue(service.esPalindromo("Ana lleva al oso la avellana."));
        Assert.assertTrue(service.esPalindromo("Anita lava la tina"));
        Assert.assertFalse(service.esPalindromo("Esto no es un palindromo"));
    }
}
