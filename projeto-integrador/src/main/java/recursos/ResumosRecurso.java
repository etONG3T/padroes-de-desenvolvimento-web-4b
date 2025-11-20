package recursos;

import java.util.List;

import entidades.Resumos;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("resumo")
public class ResumosRecurso {
    @GET
    public List<Resumos> listar(){
        return Resumos.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Resumos resumos){
        resumos.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        Resumos.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Resumos resumosAtualizado){
        Resumos resumosExistente = Resumos.findById(id);

        resumosExistente.nome = resumosAtualizado.nome;
        resumosExistente.aluno = resumosAtualizado.aluno;
    }
}