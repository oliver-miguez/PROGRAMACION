import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class personaxeTest extends personaxe {

    @Test
    @DisplayName("Test getNome")
    public void testSetNome() {
        personaxe p = new personaxe();
        p.setNome("Oliver");
        assertEquals("Oliver", p.getNome());
    }//end test


    @ParameterizedTest
    @DisplayName("Test setVida")
    @CsvSource({
            "-1, 3",
            "0, 0",
            "1, 1",
    })
    public void testSetVida(int vida, int esperado) {
        personaxe p2 = new personaxe();
        p2.setVida(vida);
        //if (vida >= 0 && vida <= 5) {
        assertEquals(esperado, p2.getVida());
        //} else {
        //  assertEquals(3, p2.getVida());
        //}
    }
}