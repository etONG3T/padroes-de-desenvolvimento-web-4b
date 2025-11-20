
package recursos;

import java.util.List;

import entidades.Planner;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("planner")
public class PlannerRecurso {
    @GET
    public List<Planner> listar(){
        return Planner.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Planner planner){
        planner.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        Planner.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Planner plannerAtualizado){
        Planner plannerExistente = Planner.findById(id);

        plannerExistente.prioridades = plannerAtualizado.prioridades;
        plannerExistente.agenda = plannerAtualizado.agenda;
        plannerExistente.tarefas = plannerAtualizado.tarefas;
        plannerExistente.aluno = plannerAtualizado.aluno;
    }
}
