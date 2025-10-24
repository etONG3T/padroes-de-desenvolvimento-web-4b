package recursos;

import java.util.List;

import entidades.Funcionario;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("funcionario")
public class FuncionarioRecurso {
    @GET
    public List<Funcionario> listar() {
        return Funcionario.listAll(Sort.ascending("nome"));
    }
}
