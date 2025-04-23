import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    @DisplayName("Codigo")
    void testCodigo(){
        Produto produto1 = new Produto();

        produto1.setCodigo(3);
        assertEquals(3, produto1.getCodigo());
    }

    @Test
    @DisplayName("Precio")
    void testPrecio(){
        Produto produto2 = new Produto();

        produto2.setPrecio(23);
        assertEquals(23, produto2.getPrecio());
    }

    @Test
    @DisplayName("Stock")
    void testStock(){
        Produto produto3 = new Produto();

        produto3.setCantidadStock(-1);
        assertEquals(0, produto3.getCantidadStock());
    }

    @ParameterizedTest
    @CsvSource({
            "-1 , 0",
            "-1 , 0",
            "101, 101",
            "100, 100",
    })
    void testStock2(int cantidad, int esperado){
        Produto produto4 = new Produto();
        produto4.setCantidadStock(cantidad);
        assertEquals(esperado,produto4.getCantidadStock());
    }


    @Test
    @DisplayName("Metodos")
    void testMetodoAplicarDescuento(){
        Produto produto5 = new Produto();
        produto5.setPrecio(50);
        produto5.aplicarDescuento(5);
        assertEquals(50/5 , produto5.getPrecio());
    }

    @Test
    @DisplayName("Vender")
    void testVender(){
        Produto produto6 = new Produto();
        produto6.setCantidadStock(20);
        boolean resultado = produto6.vender(21);
        assertTrue(resultado, "OLEE");
    }

}