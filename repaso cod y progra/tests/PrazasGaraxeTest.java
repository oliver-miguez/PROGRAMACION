import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrazasGaraxeTest extends PrazasGaraxe {


    public PrazasGaraxeTest(String rua, int numero, String localidade, String vendeseOuAlugase, int ancho, int largo, int numPlaza, double prezo) {
        super(rua, numero, localidade, vendeseOuAlugase, ancho, largo, numPlaza, prezo);
    }

    @Test
    @DisplayName("prueba test ")

    void testSetVendeOuAlugase(){
        PrazasGaraxe praz1 = new PrazasGaraxe(getRua(),getNumero(),getLocalidade(),getVendeseOuAlugase(),getAncho(),getLargo(),getNumPlaza(),getPrezo());
        praz1.setVendeseOuAlugase("vendese");
        assertEquals("vendese", praz1.getVendeseOuAlugase());
    }


}