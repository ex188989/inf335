package br.unicamp.ic.inf335.beans;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnuncioBeanTest {

    @Test
    void testGetMethods() throws MalformedURLException {
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        URL url = new URL("https://unicamp.br/unicamp/");

        fotosUrl.add(url);
        ProdutoBean prod = new ProdutoBean("001", "Celular MyCel Y77", "64GB, Preto, 4GB RAM", 3000.0, "Novo");
        AnuncioBean anuncio = new AnuncioBean(prod, fotosUrl, 0.0);
        assertAll("anuncio",
                () -> assertEquals(prod, anuncio.getProduto()),
                () -> assertEquals(fotosUrl, anuncio.getFotosUrl()),
                () -> assertEquals(prod.getValor(), anuncio.getValor()),
                () -> assertEquals(0.0, anuncio.getDesconto())
        );
    }

    @Test
    void testGetMethodsWithDiscount() throws MalformedURLException {
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        URL url = new URL("https://unicamp.br/unicamp/");
        Double discount = 0.5;

        fotosUrl.add(url);
        ProdutoBean prod = new ProdutoBean("001", "Celular MyCel Y77", "64GB, Preto, 4GB RAM", 3000.0, "Novo");
        AnuncioBean anuncio = new AnuncioBean(prod, fotosUrl, discount);
        assertAll("anuncio",
                () -> assertEquals(prod, anuncio.getProduto()),
                () -> assertEquals(fotosUrl, anuncio.getFotosUrl()),
                () -> assertEquals(prod.getValor() * discount, anuncio.getValor()),
                () -> assertEquals(0.5, anuncio.getDesconto())
        );
    }
}
