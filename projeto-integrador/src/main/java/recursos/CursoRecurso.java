package recursos;

import java.util.List;

import entidades.Curso;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("curso")
public class CursoRecurso {
    @GET
    public List<Curso> listar(){
        return Curso.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Curso curso){
        curso.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Integer id){
        Curso.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id,  Curso cursoAtualizado){
        Curso cursoExistente = Curso.findById(id);

        cursoExistente.nome = cursoAtualizado.nome;
        cursoExistente.turma = cursoAtualizado.turma;
        cursoExistente.disciplina = cursoAtualizado.disciplina;
    }

}