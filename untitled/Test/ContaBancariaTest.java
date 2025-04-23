import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;



public class ContaBancariaTest {


    @Test
    @DisplayName("Practica con tests")
     public void testSetTitular (){
        ContaBancaria newConta = new ContaBancaria();
        newConta.setTitular("Pedro");
        assertEquals("Pedro",newConta.getTitular());
    }


    @Test
    public void testCompararTitular(){
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta = new ContaBancaria();
        conta2.setTitular("Oliver");
        conta.setTitular("Oliver");

        //assertTrue(conta.getTitular() == "Carlos");
        assertEquals(conta.getTitular(), conta2.getTitular());
    }


    @ParameterizedTest
    @DisplayName("Prueba con un parameterizedTest")
    @CsvSource({
            "0 , 10",
            "2 , 2",
            "4 , 4",
            "4 , 4",
    })
    public void testIngreso(int cantidad , int esperado){
        ContaBancaria conta = new ContaBancaria();
        conta.setCantidad(cantidad);
        assertEquals(esperado, conta.getCantidad());
    }
}