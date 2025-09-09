package entidades;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;


@QuarkusTest
public class CategoriaTests {
    @Test
    @Transactional
    public void testSalvaUmaCategoria () {
        Categoria categoria = new Categoria ();
        categoria.nome = "Doces";

        categoria.persist();

        Assertions.assertEquals(11, categoria.codigo);

        System.out.println ("Id Salvo: " + categoria.codigo);
    }
}