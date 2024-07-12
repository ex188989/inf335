package br.unicamp.ic.inf335.beans;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnuncianteBeanTest {

    @Test
    void testValorMedio() throws MalformedURLException{
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        URL url = new URL("https://unicamp.br/unicamp/");
        ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();

        fotosUrl.add(url);

        ProdutoBean prod = new ProdutoBean("001", "Celular MyCel Y77", "64GB, Preto, 4GB RAM", 3000.0, "Novo");
        AnuncioBean anuncio = new AnuncioBean(prod, fotosUrl, 0.0);
        anuncios.add(anuncio);

        ProdutoBean prod2 = new ProdutoBean("002", "Celular MyZel Z66", "64GB, Preto, 4GB RAM", 1500.0, "Novo");
        AnuncioBean anuncio2 = new AnuncioBean(prod2, fotosUrl, 0.0);
        anuncios.add(anuncio2);

        AnuncianteBean anunciante = new AnuncianteBean("Joao", "000.000.000-00", anuncios);
        assertEquals(2250.0, anunciante.valorMedioAnuncios());
    }
}
