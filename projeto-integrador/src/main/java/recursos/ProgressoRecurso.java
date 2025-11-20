
package recursos;

import java.util.List;

import entidades.Progresso;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("progresso")
public class ProgressoRecurso {
    @GET
    public List<Progresso> listar(){
        return Progresso.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Progresso progresso) {
        progresso.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        Progresso.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Progresso progressoAtualizado){
        Progresso progressoExistente = Progresso.findById(id);

        progressoExistente.disciplina = progressoAtualizado.disciplina;
        progressoExistente.aluno = progressoAtualizado.aluno;
    }

}
