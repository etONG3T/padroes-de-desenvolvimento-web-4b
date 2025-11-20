package recursos;

import java.util.List;

import entidades.Aluno;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("aluno")
public class AlunoRecurso {
    @GET
    public List<Aluno> listar(){
        return Aluno.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Aluno aluno){
        aluno.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deletar(@PathParam("id") Integer id){
        Aluno.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Aluno alunoAtualizado){
        Aluno alunoExistente = Aluno.findById(id);

        alunoExistente.nome = alunoAtualizado.nome;
        alunoExistente.cpf = alunoAtualizado.cpf;
        alunoExistente.email = alunoAtualizado.email;
        alunoExistente.senha = alunoAtualizado.senha;
        alunoExistente.curso = alunoAtualizado.curso;
        alunoExistente.turma = alunoAtualizado.turma;
    }

}