package recursos;

import java.util.List;

import entidades.Produto;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("produtos")
public class ProdutoRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> listar () {
        return Produto.listAll(Sort.ascending("nome"));
    }

}