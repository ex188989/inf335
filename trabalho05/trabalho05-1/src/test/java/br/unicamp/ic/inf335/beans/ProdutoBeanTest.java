package br.unicamp.ic.inf335.beans;

import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    private ProdutoBean prod = new ProdutoBean("001", "Celular MyCel Y77", "64GB, Preto, 4GB RAM", 3000.0, "Novo");

    @Test
    void isProdutoBean() {
        assertTrue(prod instanceof ProdutoBean);
    }

    @Test
    void testGetMethods(){
        assertAll("prod",
                () -> assertEquals("001", prod.getCodigo()),
                () -> assertEquals("Celular MyCel Y77", prod.getNome()),
                () -> assertEquals("64GB, Preto, 4GB RAM", prod.getDescricao()),
                () -> assertEquals(3000.0, prod.getValor()),
                () -> assertEquals("Novo", prod.getEstado())

        );
    }

    @Test
    void testCompareTo(){
        assertAll("prod",
                () -> assertEquals(-1, prod.compareTo(new ProdutoBean("002", "Celular MyZel Z77", "128GB, Preto, 8GB RAM", 4000.0, "Usado, pouco uso"))),
                () -> assertEquals(1, prod.compareTo(new ProdutoBean("003", "Celular MyYel Z66", "128GB, Preto, 8GB RAM", 2000.0, "Usado, muito uso"))),
                () -> assertEquals(0, prod.compareTo(new ProdutoBean("004", "Celular MyWel Z55", "128GB, Preto, 8GB RAM", 3000.0, "Usado, pouco uso")))
        );
    }
}