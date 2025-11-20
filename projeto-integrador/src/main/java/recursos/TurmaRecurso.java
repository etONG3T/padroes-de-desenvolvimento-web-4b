package recursos;

import java.util.List;

import entidades.Turma;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("turma")
public class TurmaRecurso {
    @GET
    public List<Turma> listar(){
        return Turma.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Turma turma){
        turma.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        Turma.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Turma turmaAtualizado){
        Turma turmaExistente = Turma.findById(id);

        turmaExistente.nome = turmaAtualizado.nome;
    }

}