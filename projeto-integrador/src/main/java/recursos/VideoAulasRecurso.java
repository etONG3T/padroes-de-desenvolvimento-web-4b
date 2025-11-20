package recursos;

import java.util.List;

import entidades.VideoAulas;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("videoaula")
public class VideoAulasRecurso {
    @GET
    public List<VideoAulas> listar(){
        return VideoAulas.listAll(Sort.ascending("titulo"));
    }

    @POST
    @Transactional
    public void salvar(VideoAulas videoaula){
        videoaula.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Integer id){
        VideoAulas.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, VideoAulas videoAulasAtualizado){
        VideoAulas videoAulasExistente = VideoAulas.findById(id);

        videoAulasExistente.titulo = videoAulasAtualizado.titulo;
        videoAulasExistente.curso = videoAulasAtualizado.curso;
        videoAulasExistente.turma = videoAulasAtualizado.turma;
        videoAulasExistente.professor = videoAulasAtualizado.professor;
    }

}